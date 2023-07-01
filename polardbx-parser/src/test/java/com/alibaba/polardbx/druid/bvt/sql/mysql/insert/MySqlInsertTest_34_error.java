/*
 * Copyright 1999-2017 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.polardbx.druid.bvt.sql.mysql.insert;

import com.alibaba.fastjson.JSON;
import com.alibaba.polardbx.druid.DbType;
import com.alibaba.polardbx.druid.sql.SQLUtils;
import com.alibaba.polardbx.druid.sql.ast.SQLStatement;
import com.alibaba.polardbx.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement;
import com.alibaba.polardbx.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.polardbx.druid.sql.parser.SQLParserFeature;
import com.alibaba.polardbx.druid.sql.visitor.ParameterizedOutputVisitorUtils;
import com.alibaba.polardbx.druid.sql.visitor.VisitorFeature;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class MySqlInsertTest_34_error extends TestCase {

    public void test_insert_0() throws Exception {
        String sql = "insert into t10 (id, name, ship_time) values (2462, '811', null）;";

        List<SQLStatement> statementList = SQLUtils.parseStatements(sql, DbType.mysql, SQLParserFeature.TDDLHint);
        SQLStatement stmt = statementList.get(0);

        MySqlInsertStatement insertStmt = (MySqlInsertStatement) stmt;

        assertEquals(1, insertStmt.getValuesList().size());
        assertEquals(3, insertStmt.getValues().getValues().size());
        assertEquals(3, insertStmt.getColumns().size());
        assertEquals(1, statementList.size());

        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        stmt.accept(visitor);

        String formatSql = "INSERT INTO t10 (id, name, ship_time)\n" +
                "VALUES (2462, '811', NULL);";
        assertEquals(formatSql, SQLUtils.toMySqlString(insertStmt));

        List<Object> params = new ArrayList<Object>();
        String psql = ParameterizedOutputVisitorUtils.parameterizeForTDDL(sql, DbType.mysql, params, VisitorFeature.OutputParameterizedQuesUnMergeValuesList);
        assertEquals("INSERT INTO t(id, name, ship_time)\n" +
                "VALUES (?, ?, ?);", psql);
        assertEquals("[2462,\"811\",null]", JSON.toJSONString(params));
    }
}
