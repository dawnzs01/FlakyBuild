/*
 * This file is part of Neo Launcher
 * Copyright (c) 2021   Neo Launcher Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.saggitt.omega.preferences

import com.android.launcher3.LauncherAppState
import com.saggitt.omega.NeoLauncher
import com.saggitt.omega.blur.BlurWallpaperProvider

class PreferencesChangeCallback(val launcher: NeoLauncher) {
    fun recreate() {
        if (launcher.shouldRecreate()) launcher.recreate()
    }

    fun reloadApps() {
        val las = LauncherAppState.getInstance(launcher.applicationContext)
        val idp = las.invariantDeviceProfile
        idp.onPreferencesChanged(launcher.applicationContext)
    }

    fun updateSmartspaceProvider() {
    }

    fun updateBlur() {
        BlurWallpaperProvider.getInstance(launcher).updateAsync()
    }

    fun reloadAll() {
        launcher.model.forceReload()
    }

}