/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2022 qwq233@qwq2333.top
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
package xyz.nextalone.hook

import cc.hicore.QApp.QAppUtils
import com.github.kyuubiran.ezxhelper.utils.hookBefore
import de.robv.android.xposed.XC_MethodHook
import io.github.qauxv.base.annotation.FunctionHookEntry
import io.github.qauxv.base.annotation.UiItemAgentEntry
import io.github.qauxv.dsl.FunctionEntryRouter
import xyz.nextalone.base.MultiItemDelayableHook
import xyz.nextalone.util.clazz
import xyz.nextalone.util.hookBefore
import xyz.nextalone.util.invoke
import xyz.nextalone.util.method
import xyz.nextalone.util.throwOrTrue

@FunctionHookEntry
@UiItemAgentEntry
object SimplifyChatLongItem : MultiItemDelayableHook("na_simplify_chat_long_item_multi") {

    override val preferenceTitle = "精简聊天气泡长按菜单"
    override val allItems = setOf(
        "复制",
        "转发",
        "收藏",
        "回复",
        "多选",
        "撤回",
        "删除",
        "一起写",
        "设为精华",
        "待办",
        "私聊",
        "截图",
        "存表情",
        "相关表情",
        "复制链接",
        "存微云",
        "发给电脑",
        "静音播放",
        "复制文字",
        "转发文字",
        "免提播放",
        "2X",
        "保存",
        "群待办"
    )
    override val defaultItems = setOf<String>()

    override val uiItemLocation = FunctionEntryRouter.Locations.Simplify.UI_CHAT_MSG

    override fun initOnce() = throwOrTrue {
        if (QAppUtils.isQQnt()) {
            "com/tencent/qqnt/aio/menu/ui/QQCustomMenuNoIconLayout".clazz!!
                .method("setMenu")!!
                .hookBefore {
                    val list = it.args[0].javaClass.getDeclaredField("a")
                        .apply { isAccessible = true }
                        .get(it.args[0]) as MutableList<*>
                    list.forEach { item ->
                        val str = item?.invoke("c") as String
                        if (activeItems.contains(str))
                            list.remove(item)
                    }
                }
        } else {
            val callback: (XC_MethodHook.MethodHookParam) -> Unit = callback@{
                if (!isEnabled) return@callback
                val str = it.args[1] as String
                if (activeItems.contains(str))
                    it.result = null
            }
            "com.tencent.mobileqq.utils.dialogutils.QQCustomMenuImageLayout".clazz?.declaredMethods.run {
                this?.forEach { method ->
                    if (method.name == "setMenu") {
                        val customMenu = method.parameterTypes[0].name
                        runCatching {
                            customMenu.clazz?.method {
                                it.parameterTypes.contentEquals(arrayOf(Int::class.java, String::class.java, Int::class.java, Int::class.java))
                            }?.hookBefore(this@SimplifyChatLongItem, callback)
                        }
                        runCatching {
                            customMenu.clazz?.method {
                                it.parameterTypes.contentEquals(arrayOf(Int::class.java, String::class.java, Int::class.java))
                            }?.hookBefore(this@SimplifyChatLongItem, callback)
                        }
                        return@forEach
                    }
                }
            }
        }
    }
}
