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

package com.saggitt.omega.launcherclient

import android.content.ComponentName
import android.content.Context
import android.content.ServiceConnection
import android.os.IBinder
import android.util.Log
import com.saggitt.omega.preferences.NeoPrefs

open class BaseClientService(context: Context, flags: Int) : ServiceConnection {
    private var mConnected = false
    private val mContext: Context = context
    private val mFlags = flags
    private val mBridge: ServiceConnection = this

    fun connect(): Boolean {
        if (!mConnected) {
            try {
                val prefs = NeoPrefs.getInstance(mContext)
                if (prefs.feedProvider.getValue() != "") {
                    mConnected = mContext.bindService(
                        LauncherClient.getIntent(mContext, false),
                        mBridge,
                        mFlags
                    )
                }
            } catch (e: Throwable) {
                Log.e("LauncherClient", "Unable to connect to overlay service", e)
            }
        }
        return mConnected
    }

    fun disconnect() {
        if (mConnected) {
            mContext.unbindService(mBridge)
            mConnected = false
        }
    }

    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {}

    override fun onServiceDisconnected(name: ComponentName?) {}
}