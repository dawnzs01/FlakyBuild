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

package com.alibaba.polardbx.optimizer.core.function;

import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.type.InferTypes;
import org.apache.calcite.sql.type.OperandTypes;
import org.apache.calcite.sql.type.ReturnTypes;
import org.apache.calcite.sql.type.SqlTypeFamily;

/**
 * Method for {@code  DATE_FORMAT(date,format)}.
 * <p>
 * Created by lingce.ldm on 2016/11/3.
 */
public class SqlGetFormatFunction extends SqlFunction {

    public SqlGetFormatFunction(String name) {
        super(
            name,
            SqlKind.OTHER_FUNCTION,
            ReturnTypes.VARCHAR_2000,
            InferTypes.FIRST_KNOWN,
            OperandTypes.or(
                OperandTypes.family(SqlTypeFamily.DATETIME, SqlTypeFamily.STRING),
                OperandTypes.family(SqlTypeFamily.STRING, SqlTypeFamily.STRING)),
            SqlFunctionCategory.TIMEDATE);
    }
}
