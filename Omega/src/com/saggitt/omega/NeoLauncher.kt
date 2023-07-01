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

package com.saggitt.omega

import android.content.ComponentName
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.content.IntentSender
import android.content.pm.LauncherApps
import android.graphics.Rect
import android.hardware.camera2.CameraManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultRegistry
import androidx.activity.result.ActivityResultRegistryOwner
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import com.android.launcher3.AppFilter
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherAppState
import com.android.launcher3.LauncherRootView
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.pm.UserCache
import com.android.launcher3.popup.SystemShortcut
import com.android.launcher3.touch.AllAppsSwipeController
import com.android.launcher3.util.ComponentKey
import com.android.launcher3.util.TouchController
import com.android.launcher3.views.OptionsPopupView
import com.android.systemui.plugins.shared.LauncherOverlayManager
import com.saggitt.omega.gestures.GestureController
import com.saggitt.omega.gestures.VerticalSwipeGestureController
import com.saggitt.omega.popup.OmegaShortcuts
import com.saggitt.omega.preferences.NeoPrefs
import com.saggitt.omega.preferences.PreferencesChangeCallback
import com.saggitt.omega.util.Config
import com.saggitt.omega.util.firstBlocking
import com.saggitt.omega.util.hasStoragePermission
import com.saggitt.omega.views.OmegaBackgroundView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import java.util.stream.Stream

// compiler is misidentifying lifecycle's getter(s), ignore the warning for now
class NeoLauncher : Launcher(), LifecycleOwner, SavedStateRegistryOwner,
                    ActivityResultRegistryOwner {

    val prefs: NeoPrefs by lazy { Utilities.getOmegaPrefs(this) }
    val gestureController by lazy { GestureController(this) }
    val background by lazy { findViewById<OmegaBackgroundView>(R.id.omega_background)!! }
    val dummyView by lazy { findViewById<View>(R.id.dummy_view)!! }
    val optionsView by lazy { findViewById<OptionsPopupView>(R.id.options_view)!! }
    private val prefCallback = PreferencesChangeCallback(this)

    private val hiddenApps = ArrayList<AppInfo>()
    private val allApps = ArrayList<AppInfo>()
    private var paused = false
    private var sRestart = false

    private val lifecycleRegistry = LifecycleRegistry(this)
    private val savedStateRegistryController = SavedStateRegistryController.create(this)
    override val savedStateRegistry: SavedStateRegistry
        get() = savedStateRegistryController.savedStateRegistry

    override val lifecycle: Lifecycle
        get() = lifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1
            && !this.hasStoragePermission
        ) Utilities.requestStoragePermission(this)

        savedStateRegistryController.performRestore(savedInstanceState)
        super.onCreate(savedInstanceState)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
        prefs.registerCallback(prefCallback)
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        val config = Config(this)
        config.setAppLanguage(prefs.profileLanguage.getValue())
        mOverlayManager = defaultOverlay
        //Set Initial value for idp columns and rows
        val camManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager?
        camManager?.registerTorchCallback(object : CameraManager.TorchCallback() {
            override fun onTorchModeUnavailable(cameraId: String) {
            }

            override fun onTorchModeChanged(cameraId: String, enabled: Boolean) {
                coroutineScope.launch {
                    if (cameraId == camManager.cameraIdList[0]) {
                        prefs.dashTorchState.set(enabled)
                    }
                }
            }
        }, null)

        val idp = LauncherAppState.getIDP(this)
        coroutineScope.launch {
            if (prefs.firstTimeRun.get().firstBlocking()) {
                prefs.drawerGridColumns.set(idp.numAllAppsColumns)
                prefs.desktopGridColumns.set(idp.numColumns)
                prefs.desktopGridRows.set(idp.numRows)
                prefs.dockNumIcons.set(idp.numShownHotseatIcons)
                prefs.firstTimeRun.set(false)
            }
            loadHiddenApps(prefs.drawerHiddenAppSet.getValue())
        }
    }

    override val activityResultRegistry: ActivityResultRegistry
        get() = object : ActivityResultRegistry() {
            override fun <I : Any?, O : Any?> onLaunch(
                requestCode: Int,
                contract: ActivityResultContract<I, O>,
                input: I,
                options: ActivityOptionsCompat?,
            ) {
                val activity = this@NeoLauncher

                // Immediate result path
                val synchronousResult = contract.getSynchronousResult(activity, input)
                if (synchronousResult != null) {
                    Handler(Looper.getMainLooper()).post {
                        dispatchResult(
                            requestCode,
                            synchronousResult.value
                        )
                    }
                    return
                }

                // Start activity path
                val intent = contract.createIntent(activity, input)
                var optionsBundle: Bundle? = null
                // If there are any extras, we should defensively set the classLoader
                if (intent.extras != null && intent.extras!!.classLoader == null) {
                    intent.setExtrasClassLoader(activity.classLoader)
                }
                if (intent.hasExtra(StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
                    optionsBundle =
                        intent.getBundleExtra(StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)
                    intent.removeExtra(StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)
                } else if (options != null) {
                    optionsBundle = options.toBundle()
                }
                if (RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS == intent.action) {
                    // requestPermissions path
                    var permissions =
                        intent.getStringArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS)
                    if (permissions == null) {
                        permissions = arrayOfNulls(0)
                    }
                    ActivityCompat.requestPermissions(activity, permissions, requestCode)
                } else if (StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST == intent.action) {
                    val request: IntentSenderRequest =
                        intent.getParcelableExtra(StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST)!!
                    try {
                        // startIntentSenderForResult path
                        ActivityCompat.startIntentSenderForResult(
                            activity, request.intentSender,
                            requestCode, request.fillInIntent, request.flagsMask,
                            request.flagsValues, 0, optionsBundle
                        )
                    } catch (e: IntentSender.SendIntentException) {
                        Handler(Looper.getMainLooper()).post {
                            dispatchResult(
                                requestCode, RESULT_CANCELED,
                                Intent()
                                    .setAction(StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST)
                                    .putExtra(
                                        StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION,
                                        e
                                    )
                            )
                        }
                    }
                } else {
                    // startActivityForResult path
                    ActivityCompat.startActivityForResult(
                        activity,
                        intent,
                        requestCode,
                        optionsBundle
                    )
                }
            }

        }

    private suspend fun loadHiddenApps(hiddenAppsSet: Set<String>) {
        val mContext = this
        CoroutineScope(Dispatchers.IO).launch {
            val appFilter = AppFilter()
            for (user in UserCache.INSTANCE[mContext].userProfiles) {
                val duplicatePreventionCache: MutableList<ComponentName> = ArrayList()
                for (info in getSystemService(
                    LauncherApps::class.java
                ).getActivityList(null, user)) {
                    val key = ComponentKey(info.componentName, info.user)
                    if (hiddenAppsSet.contains(key.toString())) {
                        val appInfo = AppInfo(info, info.user, false)
                        hiddenApps.add(appInfo)
                    }
                    if (prefs.searchHiddenApps.get().first()) {
                        if (!appFilter.shouldShowApp(info.componentName, user)) {
                            continue
                        }
                        if (!duplicatePreventionCache.contains(info.componentName)) {
                            duplicatePreventionCache.add(info.componentName)
                            val appInfo = AppInfo(mContext, info, user)
                            allApps.add(appInfo)
                        }
                    }
                }
            }
        }
    }

    override fun getSupportedShortcuts(): Stream<SystemShortcut.Factory<*>> {
        return Stream.concat(
            super.getSupportedShortcuts(),
            Stream.of(
                OmegaShortcuts.CUSTOMIZE,
                OmegaShortcuts.APP_REMOVE,
                OmegaShortcuts.APP_UNINSTALL
            )
        )
    }

    override fun getDefaultOverlay(): LauncherOverlayManager {
        if (mOverlayManager == null) {
            mOverlayManager = OverlayCallbackImpl(this)
        }
        return mOverlayManager
    }

    override fun onStart() {
        super.onStart()
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START)
    }

    override fun onResume() {
        super.onResume()
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        restartIfPending()
        paused = false
    }

    override fun onPause() {
        super.onPause()
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        paused = true
    }

    override fun onStop() {
        super.onStop()
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        prefs.unregisterCallback()
        if (sRestart) {
            sRestart = false
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        savedStateRegistryController.performSave(outState)
    }

    override fun setupViews() {
        super.setupViews()
        findViewById<LauncherRootView>(R.id.launcher).let {
            it.setViewTreeLifecycleOwner(this)
            it.setViewTreeSavedStateRegistryOwner(this)
        }
    }

    private fun restartIfPending() {
        if (sRestart) {
            neoApp.restart(false)
        }
    }

    fun scheduleRestart() {
        if (paused) {
            sRestart = true
        } else {
            Utilities.restartLauncher(this)
        }
    }

    fun shouldRecreate() = !sRestart

    inline fun prepareDummyView(view: View, crossinline callback: (View) -> Unit) {
        val rect = Rect()
        dragLayer.getViewRectRelativeToSelf(view, rect)
        prepareDummyView(rect.left, rect.top, rect.right, rect.bottom, callback)
    }

    inline fun prepareDummyView(left: Int, top: Int, crossinline callback: (View) -> Unit) {
        val size = resources.getDimensionPixelSize(R.dimen.options_menu_thumb_size)
        val halfSize = size / 2
        prepareDummyView(left - halfSize, top - halfSize, left + halfSize, top + halfSize, callback)
    }

    inline fun prepareDummyView(
        left: Int, top: Int, right: Int, bottom: Int,
        crossinline callback: (View) -> Unit,
    ) {
        (dummyView.layoutParams as ViewGroup.MarginLayoutParams).let {
            it.width = right - left
            it.height = bottom - top
            it.leftMargin = left
            it.topMargin = top
        }
        dummyView.requestLayout()
        dummyView.post { callback(dummyView) }
    }

    override fun createTouchControllers(): Array<TouchController> {
        val list = ArrayList<TouchController>()
        list.add(dragController)
        list.add(AllAppsSwipeController(this))
        list.add(VerticalSwipeGestureController(this))


        return list.toTypedArray()
    }

    companion object {

        @JvmStatic
        fun getLauncher(context: Context): NeoLauncher {
            return context as? NeoLauncher
                ?: (context as ContextWrapper).baseContext as? NeoLauncher
                ?: LauncherAppState.getInstance(context).launcher as NeoLauncher
        }
    }
}

val Context.nLauncher: NeoLauncher
    get() = NeoLauncher.getLauncher(this)