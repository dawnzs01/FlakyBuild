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

package me.singleneuron.data

import io.github.qauxv.util.Log
import io.github.qauxv.util.encodeToJson
import kotlinx.serialization.Serializable
import org.json.JSONObject

@Serializable
data class StructMsgData(
    var prompt: String, var news: StructMsgNewsData, var config: StructMsgConfigData, var extra: String
) {

    var app: String = "com.tencent.structmsg"
    var desc: String = "新闻"
    var view: String = "news"
    var ver: String = "0.0.0.1"
    var meta: Map<String, StructMsgNewsData> = mapOf(
        "news" to news
    )

    init {
        try {
            val appid = JSONObject(extra).optLong("appid", -1)
            news.appid = if (appid == -1L) null else appid.toString()
        } catch (e: Exception) {
            Log.e(e)
        }
    }

    companion object {
        @JvmStatic
        fun fromMiniApp(miniApp: MiniAppArkData): StructMsgData {
            val detail_1 = miniApp.meta["detail_1"]!!
            return StructMsgData(
                miniApp.prompt, StructMsgNewsData(
                    detail_1.desc, detail_1.qqdocurl, detail_1.preview, detail_1.title, detail_1.title
                ), StructMsgConfigData(
                    miniApp.config.ctime
                ), miniApp.extra
            )
        }
    }

    override fun toString(): String = this.encodeToJson()
}

@Serializable
data class StructMsgNewsData(
    var desc: String, var jumpUrl: String, var preview: String, var tag: String, var title: String
) {

    var app_type: Int = 1
    var appid: String? = null

}

@Serializable
data class StructMsgConfigData(
    var ctime: Long,
) {

    var autosize: Boolean = true
    var forward: Boolean = true
    var type: String = "normal"
}
