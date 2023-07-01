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
package io.github.qauxv.config;

import io.github.qauxv.BuildConfig;
import io.github.qauxv.util.MainProcess;

public class ConfigItems {

    public static final String qn_hide_msg_list_miniapp = "qn_hide_msg_list_miniapp";
    public static final String qn_hide_ex_entry_group = "qn_hide_ex_entry_group";
    public static final String qn_muted_at_all = "qn_muted_at_all";
    public static final String qn_muted_red_packet = "qn_muted_red_packet";
    public static final String qn_mute_talk_back = "qn_mute_talk_back";
    public static final String qn_file_recv_redirect_enable = "qn_file_recv_redirect_enable";
    public static final String qn_file_recv_redirect_path = "qn_file_recv_redirect_path";
    public static final String qn_fake_bat_expr = "qn_fake_bat_expr";
    public static final String cfg_nice_user = "cfg_nice_user";
    public static final String cache_qn_prev_version = "cache_qn_prev_version";
    public static final String qn_script_global = "qn_script_global";
    public static final String qn_script_count = "qn_script_count";
    public static final String qn_script_code = "qn_script_code_";
    public static final String qn_script_enable_ = "qn_script_enable_";

    @MainProcess
    public static void removePreviousCacheIfNecessary() {
        // clear cache if is a release build to invalidate previous potential bad dex-deobfuscation result
        // do not clear cache if is a debug build, devs should clear cache themselves
        if (BuildConfig.DEBUG) {
            return;
        }
        ConfigManager cache = ConfigManager.getCache();
        if (cache.getIntOrDefault(cache_qn_prev_version, -1) < BuildConfig.VERSION_CODE) {
            cache.clear();
            cache.putInt(cache_qn_prev_version, BuildConfig.VERSION_CODE);
            cache.save();
        }
    }
}
