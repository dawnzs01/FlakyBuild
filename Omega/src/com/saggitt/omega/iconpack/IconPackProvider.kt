package com.saggitt.omega.iconpack

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.InsetDrawable
import android.os.Build
import android.os.Process
import android.os.UserHandle
import androidx.core.content.ContextCompat
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.icons.ClockDrawableWrapper
import com.android.launcher3.icons.ThemedIconDrawable
import com.android.launcher3.util.MainThreadInitializedObject
import com.saggitt.omega.NeoApp
import com.saggitt.omega.NeoApp.Companion.minSDK
import com.saggitt.omega.util.Config
import com.saggitt.omega.util.Config.Companion.LAWNICONS_PACKAGE_NAME
import com.saggitt.omega.util.Config.Companion.THEME_ICON_THEMED
import com.saulhdev.neolauncher.icons.ClockMetadata
import com.saulhdev.neolauncher.icons.CustomAdaptiveIconDrawable

class IconPackProvider(private val context: Context) {

    private val systemIconPack = SystemIconPack(context)
    private val iconPacks = mutableMapOf<String, IconPack?>()
    private val systemIcon = CustomAdaptiveIconDrawable.wrapNonNull(
        ContextCompat.getDrawable(context, R.drawable.ic_launcher_foreground)!!
    )

    fun getIconPackOrSystem(packageName: String): IconPack? {
        if (packageName.isEmpty()) return systemIconPack
        return getIconPack(packageName)
    }

    fun getIconPack(packageName: String): IconPack? {
        if (packageName.isEmpty()) {
            return null
        }
        return iconPacks.getOrPut(packageName) {
            try {
                CustomIconPack(context, packageName)
            } catch (_: PackageManager.NameNotFoundException) {
                null
            }
        }
    }

    fun getIconPackList(): List<IconPackInfo> {
        val pm = context.packageManager

        val iconPacks = Config.ICON_INTENTS
            .flatMap { pm.queryIntentActivities(it, 0) }
            .associateBy { it.activityInfo.packageName }
            .mapTo(mutableSetOf()) { (_, info) ->
                IconPackInfo(
                    info.loadLabel(pm).toString(),
                    info.activityInfo.packageName,
                    info.loadIcon(pm)
                )
            }
        val defaultIconPack =
            IconPackInfo(context.getString(R.string.icon_pack_default), "", systemIcon)
        val lawniconsInfo = try {
            val info = pm.getPackageInfo(LAWNICONS_PACKAGE_NAME, 0)
            IconPackInfo(
                info.applicationInfo.loadLabel(pm).toString(),
                LAWNICONS_PACKAGE_NAME,
                info.applicationInfo.loadIcon(pm)
            )
        } catch (e: PackageManager.NameNotFoundException) {
            null
        }
        val themedIconsInfo = if (minSDK(Build.VERSION_CODES.TIRAMISU)) IconPackInfo(
            context.getString(R.string.title_themed_icons),
            THEME_ICON_THEMED,
            /*
            ThemedIconDrawable.wrapWithThemeData(
                ContextCompat.getDrawable(context, R.mipmap.ic_launcher),
                context.resources,
                ThemedIconDrawable.ThemeData(
                    context.resources,
                    context.packageName,
                    R.drawable.ic_launcher_foreground
                )
            )*/
            ContextCompat.getDrawable(context, R.drawable.ic_launcher)!!
        ) else null
        return listOfNotNull(
            defaultIconPack,
            if (Utilities.ATLEAST_S) lawniconsInfo else null,
            themedIconsInfo
        ) + iconPacks.sortedBy { it.name }
    }

    fun getClockMetadata(iconEntry: IconEntry): ClockMetadata? {
        val iconPack = getIconPackOrSystem(iconEntry.packPackageName) ?: return null
        return iconPack.getClock(iconEntry)
    }

    fun getDrawable(iconEntry: IconEntry, iconDpi: Int, user: UserHandle): Drawable? {
        val iconPack = getIconPackOrSystem(iconEntry.packPackageName) ?: return null
        iconPack.loadBlocking()
        val packageManager = context.packageManager
        val drawable = iconPack.getIcon(iconEntry, iconDpi) ?: return null
        val clockMetadata =
            if (user == Process.myUserHandle()) iconPack.getClock(iconEntry) else null
        val isThemedIconsEnabled =
            Utilities.ATLEAST_S && (iconEntry.packPackageName in listOf(
                LAWNICONS_PACKAGE_NAME
            ))
        if (clockMetadata != null) {
            val clockDrawable: ClockDrawableWrapper =
                ClockDrawableWrapper.forMeta(Build.VERSION.SDK_INT, clockMetadata) {
                    wrapThemedData(
                        packageManager,
                        iconEntry,
                        drawable
                    ) ?: drawable
                }
            if (clockDrawable != null) {
                return if (isThemedIconsEnabled)
                    clockDrawable.foreground
                else
                    CustomAdaptiveIconDrawable(clockDrawable.background, clockDrawable.foreground)
            }
        }

        if (isThemedIconsEnabled) {
            return wrapThemedData(packageManager, iconEntry, drawable)
        }
        return drawable
    }

    private fun wrapThemedData(
        packageManager: PackageManager,
        iconEntry: IconEntry,
        drawable: Drawable,
    ): Drawable? {
        val themedColors: IntArray = ThemedIconDrawable.getThemedColors(context)
        val res = packageManager.getResourcesForApplication(iconEntry.packPackageName)

        @SuppressLint("DiscouragedApi")
        val resId = res.getIdentifier(iconEntry.name, "drawable", iconEntry.packPackageName)
        val bg: Drawable = ColorDrawable(themedColors[0])
        val td = ThemedIconDrawable.ThemeData(res, iconEntry.packPackageName, resId)
        return if (drawable is AdaptiveIconDrawable) {
            if (NeoApp.minSDK(Build.VERSION_CODES.TIRAMISU) && drawable.monochrome != null) {
                drawable.monochrome?.apply { setTint(themedColors[1]) }
            } else {
                val foregroundDr = drawable.foreground.apply { setTint(themedColors[1]) }
                CustomAdaptiveIconDrawable(bg, foregroundDr)
            }
        } else {
            val iconFromPack = InsetDrawable(drawable, .3f).apply { setTint(themedColors[1]) }
            td.wrapDrawable(CustomAdaptiveIconDrawable(bg, iconFromPack), 0)
        }
    }

    companion object {
        @JvmField
        val INSTANCE = MainThreadInitializedObject(::IconPackProvider)
    }
}

data class IconPackInfo(
    val name: String,
    val packageName: String,
    val icon: Drawable,
)