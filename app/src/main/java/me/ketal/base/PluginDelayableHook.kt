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

package me.ketal.base

import android.app.Activity
import android.content.Context
import android.view.View
import cc.ioctl.util.HostInfo
import io.github.qauxv.base.ISwitchCellAgent
import io.github.qauxv.base.IUiItemAgent
import io.github.qauxv.config.ConfigManager
import io.github.qauxv.hook.BaseFunctionHook
import io.github.qauxv.util.hostInfo
import kotlinx.coroutines.flow.MutableStateFlow
import xyz.nextalone.util.method
import xyz.nextalone.util.throwOrTrue

abstract class PluginDelayableHook(keyName: String) : BaseFunctionHook(keyName) {

    abstract val pluginID: String
    abstract val preference: IUiItemAgent
    val cfg = keyName
    private val m by lazy {
        "Lcom/tencent/mobileqq/pluginsdk/PluginStatic;->getOrCreateClassLoader(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/ClassLoader;"
            .method.apply {
                isAccessible = true
            }
    }

    override val uiItemAgent: IUiItemAgent get() = preference

    @Throws(Throwable::class)
    abstract fun startHook(classLoader: ClassLoader): Boolean

    override fun initOnce() = throwOrTrue {
        if (disablePluginDelayableHook) {
            error("disablePluginDelayableHook")
        }
        val classLoader = m.invoke(null, hostInfo.application, pluginID) as ClassLoader
        startHook(classLoader)
    }

    fun uiSwitchPreference(init: UiSwitchPreferenceItemFactory.() -> Unit): IUiItemAgent {
        val uiSwitchPreferenceFactory = UiSwitchPreferenceItemFactory()
        uiSwitchPreferenceFactory.init()
        return uiSwitchPreferenceFactory
    }

    fun uiClickableItem(init: UiClickableItemFactory.() -> Unit): IUiItemAgent {
        val uiClickableItemFactory = UiClickableItemFactory()
        uiClickableItemFactory.init()
        return uiClickableItemFactory
    }

    inner class UiSwitchPreferenceItemFactory : IUiItemAgent {
        lateinit var title: String
        var summary: String? = null

        override val titleProvider: (IUiItemAgent) -> String = { title }
        override val summaryProvider: ((IUiItemAgent, Context) -> String?) = { _, _ -> summary }
        override val valueState: MutableStateFlow<String?>? = null
        override val validator: ((IUiItemAgent) -> Boolean) = { isAvailable }
        override val switchProvider: ISwitchCellAgent by lazy {
            object : ISwitchCellAgent {
                override val isCheckable: Boolean get() = isAvailable

                override var isChecked: Boolean
                    get() = isEnabled
                    set(value) {
                        isEnabled = value
                    }
            }
        }
        override val onClickListener: ((IUiItemAgent, Activity, View) -> Unit)? = null
        override val extraSearchKeywordProvider: ((IUiItemAgent, Context) -> Array<String>?)? = null
    }

    inner class UiClickableItemFactory : IUiItemAgent {
        lateinit var title: String
        var summary: String? = null

        override val titleProvider: (IUiItemAgent) -> String = { title }
        override val summaryProvider: ((IUiItemAgent, Context) -> String?) = { _, _ -> summary }
        override val valueState: MutableStateFlow<String?>? = null
        override val validator: ((IUiItemAgent) -> Boolean) = { isAvailable }
        override val switchProvider: ISwitchCellAgent? = null
        override var onClickListener: ((IUiItemAgent, Activity, View) -> Unit)? = null
        override val extraSearchKeywordProvider: ((IUiItemAgent, Context) -> Array<String>?)? = null
    }

    companion object {

        private const val KEY_DISABLE_PLUGIN_DELAYABLE_HOOK = "disable_plugin_delayable_hook"
        var disablePluginDelayableHook: Boolean
            get() = ConfigManager.getDefaultConfig().getBoolean(
                KEY_DISABLE_PLUGIN_DELAYABLE_HOOK,
                getDefValForDisablePluginDelayableHook()
            )
            set(value) {
                ConfigManager.getDefaultConfig().putBoolean(KEY_DISABLE_PLUGIN_DELAYABLE_HOOK, value)
            }

        private fun getDefValForDisablePluginDelayableHook(): Boolean {
            return HostInfo.isQQ() && hostInfo.versionCode == 4056L
        }

    }

}
