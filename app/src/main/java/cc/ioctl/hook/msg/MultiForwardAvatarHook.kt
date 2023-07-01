/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2023 QAuxiliary developers
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */
package cc.ioctl.hook.msg

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.text.buildSpannedString
import cc.ioctl.hook.profile.OpenProfileCard
import cc.ioctl.util.HostInfo
import cc.ioctl.util.HostStyledViewBuilder
import cc.ioctl.util.LayoutHelper
import cc.ioctl.util.Reflex
import cc.ioctl.util.hookBeforeIfEnabled
import cc.ioctl.util.ui.FaultyDialog
import de.robv.android.xposed.XC_MethodHook.MethodHookParam
import io.github.qauxv.R
import io.github.qauxv.base.annotation.DexDeobfs
import io.github.qauxv.base.annotation.FunctionHookEntry
import io.github.qauxv.base.annotation.UiItemAgentEntry
import io.github.qauxv.dsl.FunctionEntryRouter
import io.github.qauxv.hook.CommonSwitchFunctionHook
import io.github.qauxv.ui.CommonContextWrapper
import io.github.qauxv.ui.CustomDialog
import io.github.qauxv.util.Initiator
import io.github.qauxv.util.Log
import io.github.qauxv.util.UiThread
import io.github.qauxv.util.dexkit.CAIOUtils
import io.github.qauxv.util.dexkit.DexKit.loadClassFromCache
import me.ketal.dispacher.BaseBubbleBuilderHook
import me.ketal.dispacher.OnBubbleBuilder
import me.singleneuron.data.MsgRecordData
import java.lang.reflect.Field
import java.lang.reflect.Modifier

@FunctionHookEntry
@UiItemAgentEntry
object MultiForwardAvatarHook : CommonSwitchFunctionHook(arrayOf(CAIOUtils)), OnBubbleBuilder {

    override val name = "转发消息点头像查看详细信息"
    override val description = "仅限合并转发的消息"
    override val uiItemLocation = FunctionEntryRouter.Locations.Auxiliary.MESSAGE_CATEGORY

    private var mChatItemHeadIconViewId = 0

    @SuppressLint("DiscouragedApi")
    @Throws(Exception::class)
    public override fun initOnce(): Boolean {
        BaseBubbleBuilderHook.initialize()
        val kBaseBubbleBuilder = Initiator.loadClass("com/tencent/mobileqq/activity/aio/BaseBubbleBuilder")
        val onClick = kBaseBubbleBuilder.getMethod("onClick", View::class.java)
        hookBeforeIfEnabled(onClick, 49) { param: MethodHookParam ->
            val ctx = Reflex.getInstanceObjectOrNull(param.thisObject, "a", Context::class.java)
                ?: Reflex.getFirstNSFByType(param.thisObject, Context::class.java)
            val view = param.args[0] as View
            if (ctx == null || isLeftCheckBoxVisible) {
                return@hookBeforeIfEnabled
            }
            val activityName = ctx.javaClass.name
            val needShow = activityName == "com.tencent.mobileqq.activity.MultiForwardActivity" &&
                (view.javaClass.name == "com.tencent.mobileqq.vas.avatar.VasAvatar" ||
                    view.javaClass == ImageView::class.java ||
                    view.javaClass == Initiator.load("com.tencent.widget.CommonImageView"))
            if (!needShow) {
                return@hookBeforeIfEnabled
            }
            val msg = getChatMessageByView(view) ?: return@hookBeforeIfEnabled
            try {
                val istroop = Reflex.getInstanceObjectOrNull(msg, "istroop") as Int
                when (istroop) {
                    0 -> {
                        // private chat
                        val senderUin = (Reflex.getInstanceObjectOrNull(msg, "senderuin") as String).toLong()
                        createAndShowDialogCommon(ctx, msg, senderUin, null)
                    }

                    1, 3000 -> {
                        // troop and discuss group
                        val senderUin = (Reflex.getInstanceObjectOrNull(msg, "senderuin") as String).toLong()
                        val troopUin = (Reflex.getInstanceObjectOrNull(msg, "frienduin") as String).toLong()
                        createAndShowDialogCommon(ctx, msg, senderUin, troopUin)
                    }

                    else -> {
                        // wtf?
                        createAndShowDialogForDetail(ctx, msg)
                    }
                }
            } catch (e: Exception) {
                FaultyDialog.show(ctx, e)
            }
        }
        mChatItemHeadIconViewId = HostInfo.getApplication().resources
            .getIdentifier("chat_item_head_icon", "id", HostInfo.getPackageName())
        check(mChatItemHeadIconViewId != 0) { "R.id.chat_item_head_icon not found" }
        return true
    }

    override fun onGetView(rootView: ViewGroup, chatMessage: MsgRecordData, param: MethodHookParam) {
        // XXX: performance sensitive, peak frequency: ~68 invocations per second
        if (!isEnabled || mChatItemHeadIconViewId == 0) {
            return
        }
        // For versions >= x (x exists, where x <= 8.9.15), @[R.id.chat_item_head_icon].onCLickListener = null
        // register @[R.id.chat_item_head_icon] click event for versions >= x
        val baseBubbleBuilderOnClick = param.thisObject as View.OnClickListener
        val headIconView: View? = rootView.getTag(R.id.tag_chat_item_head_icon) as View?
            ?: rootView.findViewById(mChatItemHeadIconViewId)
        if (headIconView != null) {
            // set tag to avoid future findViewById to improve performance
            rootView.setTag(R.id.tag_chat_item_head_icon, headIconView)
        } else {
            // give up.
            return
        }
        headIconView.setOnClickListener(baseBubbleBuilderOnClick)
    }

    private var mLeftCheckBoxVisible: Field? = null

    /**
     * Target TIM or QQ<=7.6.0 Here we use DexKit!!!
     *
     * @param v the view in bubble
     * @return message or null
     */
    @JvmStatic
    @DexDeobfs(CAIOUtils::class)
    fun getChatMessageByView(v: View): Any? {
        val kAIOUtils = loadClassFromCache(CAIOUtils) ?: return null
        return try {
            Reflex.invokeStaticAny(kAIOUtils, v, View::class.java, Initiator._ChatMessage())
        } catch (e: NoSuchMethodException) {
            null
        } catch (e: Exception) {
            Log.e(e)
            null
        }
    }


    @UiThread
    private fun createAndShowDialogCommon(hostContext: Context, msg: Any, senderUin: Long, troopUin: Long?) {
        check(senderUin > 0) { "senderUin must be positive, got $senderUin" }
        check(troopUin == null || troopUin > 0) { "troopUin must be positive or null, got $troopUin" }
        val ctx = CommonContextWrapper.createAppCompatContext(hostContext)
        val dialog = CustomDialog.createFailsafe(ctx).setTitle(Reflex.getShortClassName(msg))
            .setPositiveButton("确认", null).setCancelable(true)
            .setNeutralButton("详情") { _: DialogInterface, _: Int ->
                createAndShowDialogForDetail(ctx, msg)
            }
        val ll = LinearLayout(ctx)
        ll.orientation = LinearLayout.VERTICAL
        val p = LayoutHelper.dip2px(ctx, 10f)
        ll.setPadding(p, p / 3, p, p / 3)
        if (troopUin != null) {
            // troop
            HostStyledViewBuilder.newDialogClickableItemClickToCopy(ctx, "群号", troopUin.toString(), ll, true) {
                OpenProfileCard.openTroopProfileActivity(ctx, troopUin.toString())
            }
            HostStyledViewBuilder.newDialogClickableItemClickToCopy(ctx, "成员", senderUin.toString(), ll, true) {
                if (senderUin > 10000) {
                    OpenProfileCard.openUserProfileCard(ctx, senderUin)
                }
            }
        } else {
            // private chat
            HostStyledViewBuilder.newDialogClickableItemClickToCopy(ctx, "发送者", senderUin.toString(), ll, true) {
                if (senderUin > 10000) {
                    OpenProfileCard.openUserProfileCard(ctx, senderUin)
                }
            }
        }
        val disclaimerTextView = AppCompatTextView(ctx).apply {
            // required for ClickableSpan
            movementMethod = LinkMovementMethod.getInstance()
        }
        val runnable = {
            val disclaimer = """
                警告：以上信息可能是完全错误的。
                QQ 的合并转发消息内容是由转发者的客户端生成后上传服务器的，而不是在服务器上合并后再下发的。
                因此，合并转发消息的内容存在被篡改和伪造的可能。
                在非恶意情形下，PC 端 QQ 在合并转发提供的群号可能是错误的，而 Android 端 QQ 合并转发提供的群号通常是正确的。
                以上信息仅供参考，本模块不对以上信息的正确性负责，以上信息不得作为任何依据。
            """.trimIndent()
            disclaimerTextView.text = disclaimer
        }
        disclaimerTextView.text = buildSpannedString {
            append("单击可打开，长按可复制\n")
            append("以上信息仅供参考，本模块不对以上信息的正确性负责，以上信息不得作为任何依据。\n")
            append("了解详情", object : ClickableSpan() {
                override fun onClick(widget: View) {
                    runnable()
                }
            }, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        ll.addView(disclaimerTextView)
        dialog.setView(ll)
        dialog.show()
    }

    @UiThread
    private fun createAndShowDialogForDetail(ctx: Context?, msg: Any?) {
        if (msg == null) {
            Log.e("createAndShowDialogForDetail/E msg == null")
            return
        }
        CustomDialog.createFailsafe(ctx).setTitle(Reflex.getShortClassName(msg))
            .setMessage(msg.toString())
            .setCancelable(true).setPositiveButton("确定", null).show()
    }

    private val isLeftCheckBoxVisible: Boolean
        get() {
            var a: Field? = null
            var b: Field? = null
            return try {
                if (mLeftCheckBoxVisible != null) {
                    mLeftCheckBoxVisible!!.getBoolean(null)
                } else {
                    for (f in Initiator.loadClass("com/tencent/mobileqq/activity/aio/BaseChatItemLayout").declaredFields) {
                        if (Modifier.isStatic(f.modifiers) && Modifier.isPublic(f.modifiers) && f.type == Boolean::class.javaPrimitiveType) {
                            if ("a" == f.name) {
                                a = f
                            }
                            if ("b" == f.name) {
                                b = f
                            }
                        }
                    }
                    if (a != null) {
                        mLeftCheckBoxVisible = a
                        return a.getBoolean(null)
                    }
                    if (b != null) {
                        mLeftCheckBoxVisible = b
                        return b.getBoolean(null)
                    }
                    false
                }
            } catch (e: Exception) {
                traceError(e)
                false
            }
        }
}
