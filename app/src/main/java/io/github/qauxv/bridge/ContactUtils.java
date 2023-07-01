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
package io.github.qauxv.bridge;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cc.ioctl.util.Reflex;
import com.tencent.common.app.AppInterface;
import de.robv.android.xposed.XposedHelpers;
import io.github.qauxv.base.annotation.DexDeobfs;
import io.github.qauxv.util.Initiator;
import io.github.qauxv.util.Log;
import io.github.qauxv.util.dexkit.DexKit;
import io.github.qauxv.util.dexkit.NContactUtils_getBuddyName;
import io.github.qauxv.util.dexkit.NContactUtils_getDiscussionMemberShowName;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import mqq.app.AppRuntime;

public class ContactUtils {

    private ContactUtils() {
    }

    private static final String UNICODE_RLO = "\u202E";

    @NonNull
    @DexDeobfs({NContactUtils_getDiscussionMemberShowName.class, NContactUtils_getBuddyName.class})
    public static String getTroopMemberNick(long troopUin, long memberUin) {
        return getTroopMemberNick(String.valueOf(troopUin), String.valueOf(memberUin));
    }

    @NonNull
    @DexDeobfs({NContactUtils_getDiscussionMemberShowName.class, NContactUtils_getBuddyName.class})
    public static String getTroopMemberNick(@NonNull String troopUin, @NonNull String memberUin) {
        Objects.requireNonNull(troopUin);
        Objects.requireNonNull(memberUin);
        AppRuntime app = AppRuntimeHelper.getQQAppInterface();
        assert app != null;
        try {
            Object mTroopManager = ManagerHelper.getTroopManager();
            Object troopMemberInfo = Reflex.invokeVirtualDeclaredOrdinal(mTroopManager, 0, 3, false,
                    troopUin, memberUin,
                    String.class, String.class,
                    Initiator._TroopMemberInfo());
            if (troopMemberInfo != null) {
                String troopnick = (String) XposedHelpers.getObjectField(troopMemberInfo, "troopnick");
                if (troopnick != null) {
                    String ret = troopnick.replace(UNICODE_RLO, "");
                    if (ret.trim().length() > 0) {
                        return ret;
                    }
                }
            }
        } catch (Exception | LinkageError e) {
            Log.e(e);
        }
        try {
            String ret = getDiscussionMemberShowName(app, troopUin, memberUin);
            if (ret != null) {
                ret = ret.replace(UNICODE_RLO, "");
                if (ret.trim().length() > 0) {
                    return ret;
                }
            }
        } catch (Exception | LinkageError e) {
            Log.e(e);
        }
        try {
            String ret;
            String nickname = getBuddyName(app, memberUin);
            if (nickname != null && (ret = nickname.replace(UNICODE_RLO, "")).trim().length() > 0) {
                return ret;
            }
        } catch (Exception | LinkageError e) {
            Log.e(e);
        }
        //**sigh**
        return memberUin;
    }

    @Nullable
    @DexDeobfs(NContactUtils_getDiscussionMemberShowName.class)
    public static String getDiscussionMemberShowName(@NonNull AppRuntime app, @NonNull String troopUin, @NonNull String memberUin) {
        Objects.requireNonNull(app, "app is null");
        Objects.requireNonNull(troopUin, "troopUin is null");
        Objects.requireNonNull(memberUin, "memberUin is null");
        Method getDiscussionMemberShowName = DexKit.loadMethodFromCache(NContactUtils_getDiscussionMemberShowName.INSTANCE);
        if (getDiscussionMemberShowName == null) {
            Log.e("getDiscussionMemberShowName but N_ContactUtils_getDiscussionMemberShowName not found");
            return null;
        }
        try {
            return (String) getDiscussionMemberShowName.invoke(null, app, troopUin, memberUin);
        } catch (IllegalAccessException e) {
            // should not happen
            Log.e(e);
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            Log.e(Objects.requireNonNullElse(cause, e));
            return null;
        }
    }

    @Nullable
    @DexDeobfs(NContactUtils_getBuddyName.class)
    public static String getBuddyName(@NonNull AppRuntime app, @NonNull String uin) {
        Objects.requireNonNull(app, "app is null");
        Objects.requireNonNull(uin, "uin is null");
        Method getBuddyName = DexKit.loadMethodFromCache(NContactUtils_getBuddyName.INSTANCE);
        if (getBuddyName == null) {
            Log.e("getBuddyName but N_ContactUtils_getBuddyName not found");
            return null;
        }
        try {
            return (String) getBuddyName.invoke(null, app, uin, false);
        } catch (IllegalAccessException e) {
            // should not happen
            Log.e(e);
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            Log.e(Objects.requireNonNullElse(cause, e));
            return null;
        }
    }

    @NonNull
    public static String getTroopName(@NonNull String troopUin) {
        if (TextUtils.isEmpty(troopUin)) {
            return "";
        }
        try {
            return (String) Reflex.invokeStatic(Initiator.loadClass("com.tencent.mobileqq.utils.ContactUtils"), "a",
                    AppRuntimeHelper.getQQAppInterface(), troopUin, true,
                    AppInterface.class, String.class, boolean.class, String.class);
        } catch (ReflectiveOperationException e) {
            Log.e(e);
            return troopUin;
        }
    }
}
