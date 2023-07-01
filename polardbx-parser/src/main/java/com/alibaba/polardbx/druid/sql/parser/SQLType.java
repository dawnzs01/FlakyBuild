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

package com.alibaba.polardbx.druid.sql.parser;

public enum SQLType {
    SELECT,
    UPDATE,
    INSERT,
    DELETE,
    MERGE,

    CREATE,
    ALTER,
    DROP,
    TRUNCATE,

    REPLACE,
    ANALYZE,

    EXPLAIN,

    SHOW,
    DESC,
    SET,
    DUMP_DATA,
    LIST, // for analyticdb
    WHO, // for analyticdb
    GRANT,
    REVOKE,

    COMMIT,
    ROLLBACK,
    USE,
    KILL,
    MSCK,

    ADD_USER,
    REMOVE_USER,

    CREATE_USER,
    DROP_USER,
    ALTER_USER,

    UNKNOWN
}
