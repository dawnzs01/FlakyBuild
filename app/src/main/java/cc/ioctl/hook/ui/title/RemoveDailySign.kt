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
package cc.ioctl.hook.ui.title

import android.widget.LinearLayout
import cc.ioctl.util.HookUtils
import cc.ioctl.util.HostInfo
import com.github.kyuubiran.ezxhelper.utils.getObjectAs
import com.github.kyuubiran.ezxhelper.utils.setViewZeroSize
import de.robv.android.xposed.XposedBridge
import io.github.qauxv.base.annotation.FunctionHookEntry
import io.github.qauxv.base.annotation.UiItemAgentEntry
import io.github.qauxv.dsl.FunctionEntryRouter
import io.github.qauxv.hook.CommonSwitchFunctionHook
import io.github.qauxv.util.Initiator.loadClass
import io.github.qauxv.util.QQVersion
import io.github.qauxv.util.hostInfo
import io.github.qauxv.util.isTim
import io.github.qauxv.util.requireMinQQVersion

@FunctionHookEntry
@UiItemAgentEntry
object RemoveDailySign : CommonSwitchFunctionHook("kr_remove_daily_sign") {

    override val name = "移除侧滑栏左上角打卡"
    override val uiItemLocation = FunctionEntryRouter.Locations.Simplify.MAIN_UI_TITLE

    override val isAvailable: Boolean get() = !isTim()

    override fun initOnce(): Boolean {
        if (hostInfo.packageName != HostInfo.PACKAGE_NAME_QQ) return false
        val callback = HookUtils.afterIfEnabled(this) { param ->
            // em_drawer_sign_up
            val dailySignName = when {
                requireMinQQVersion(QQVersion.QQ_8_9_28) -> "i0"
                requireMinQQVersion(QQVersion.QQ_8_9_25) -> "h0"
                // gap
                requireMinQQVersion(QQVersion.QQ_8_9_3) -> "d0"
                requireMinQQVersion(QQVersion.QQ_8_8_93) -> "c0"
                requireMinQQVersion(QQVersion.QQ_8_8_17) -> "O"
                requireMinQQVersion(QQVersion.QQ_8_8_11) -> "N"
                hostInfo.versionCode == QQVersion.QQ_8_6_0 -> "b"
                else -> "a"
            }
            param.thisObject.getObjectAs<LinearLayout>(dailySignName, LinearLayout::class.java).setViewZeroSize()
        }
        if (requireMinQQVersion(QQVersion.QQ_8_9_25)) {
            XposedBridge.hookAllConstructors(loadClass("com.tencent.mobileqq.activity.QQSettingMeView"), callback)
        } else {
            XposedBridge.hookAllConstructors(loadClass("com.tencent.mobileqq.activity.QQSettingMe"), callback)
        }
        return true
    }
}
