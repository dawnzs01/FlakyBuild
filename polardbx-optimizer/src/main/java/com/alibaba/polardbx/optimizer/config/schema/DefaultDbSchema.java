/*
 * Copyright [2013-2021], Alibaba Group Holding Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.polardbx.optimizer.config.schema;

import com.alibaba.polardbx.common.exception.TddlRuntimeException;
import com.alibaba.polardbx.common.exception.code.ErrorCode;
import com.alibaba.polardbx.gms.topology.SystemDbHelper;
import org.apache.calcite.schema.Table;

/**
 * DefaultDb Schema
 * <pre>
 *     DefaultDb is the default schema value
 *     for situation that ServerConnection.schema == null
 * </pre>
 *
 * @author chenghui.lch
 */
public class DefaultDbSchema extends AbsSchema {

    public final static String NAME = SystemDbHelper.DEFAULT_DB_NAME;

    private static final DefaultDbSchema INSTANCE = new DefaultDbSchema();

    private DefaultDbSchema() {
    }

    public static DefaultDbSchema getInstance() {
        return INSTANCE;
    }

    @Override
    public Table getTable(String tableName) {
        throw new TddlRuntimeException(ErrorCode.ERR_NO_DB_ERROR, "");
    }

}

