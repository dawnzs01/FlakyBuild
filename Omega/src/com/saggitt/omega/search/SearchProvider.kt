/*
 * This file is part of Neo Launcher
 * Copyright (c) 2023   Neo Launcher Team
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

package com.saggitt.omega.search

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable

abstract class SearchProvider(protected val context: Context) {
    abstract val displayName: String
    open val supportsVoiceSearch: Boolean = false
    open val supportsAssistant: Boolean = false
    open val supportsFeed: Boolean = false

    abstract val packageName: String
    abstract val icon: Drawable
    abstract val iconRes: Int
    open val voiceIcon: Drawable?
        get() = if (supportsVoiceSearch)
            throw RuntimeException("Voice search supported but not implemented")
        else null
    open val assistantIcon: Drawable?
        get() = if (supportsVoiceSearch)
            throw RuntimeException("Assistant supported but not implemented")
        else null

    /**
     * Whether the settings intent needs to be sent as broadcast
     */
    open val isBroadcast = false
    open val isAvailable: Boolean = true

    abstract fun startSearch(callback: (intent: Intent) -> Unit = {})
    open fun startVoiceSearch(callback: (intent: Intent) -> Unit = {}) {
        if (supportsVoiceSearch) throw RuntimeException("Voice search supported but not implemented")
    }

    open fun startAssistant(callback: (intent: Intent) -> Unit = {}) {
        if (supportsAssistant) throw RuntimeException("Assistant supported but not implemented")
    }

    open fun startFeed(callback: (intent: Intent) -> Unit = {}) {
        if (supportsFeed) throw RuntimeException("Feed supported but not implemented")
    }
}