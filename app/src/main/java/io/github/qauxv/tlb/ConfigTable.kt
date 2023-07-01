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
package io.github.qauxv.tlb

import cc.ioctl.util.HostInfo.isTim
import io.github.qauxv.base.annotation.InternalApi
import io.github.qauxv.util.hostInfo
import io.github.qauxv.util.isPlayQQ

object ConfigTable {

    @InternalApi
    val cacheMap: Map<String, Any?> by lazy {
        val map: HashMap<String, Any?> = HashMap()
        val versionCode = hostInfo.versionCode
        val table: ConfigTableInterface = when {
            isTim() -> TIMConfigTable()
            isPlayQQ() -> PlayQQConfigTable()
            else -> QQConfigTable()
        }
        for (pair in table.rangingConfigs) {
            for (i in versionCode downTo 1L) {
                if (pair.value.containsKey(i)) {
                    map[pair.key] = pair.value[i]
                    break
                }
            }
        }
        for (pair in table.configs) {
            if (pair.value.containsKey(versionCode)) {
                map[pair.key] = pair.value[versionCode]
            }
        }
        map
    }

    @JvmStatic
    fun <T> getConfig(className: String): T {
        val config = cacheMap[className]
        return config as T ?: throw RuntimeException("$className :Unsupported Version: " + hostInfo.versionName)
    }
}
