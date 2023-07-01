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

package com.alibaba.polardbx.druid.bvt.sql.mysql.param;

import com.alibaba.polardbx.druid.DbType;
import com.alibaba.polardbx.druid.sql.SQLUtils;
import com.alibaba.polardbx.druid.sql.ast.SQLStatement;
import com.alibaba.polardbx.druid.sql.parser.SQLParserUtils;
import com.alibaba.polardbx.druid.sql.parser.SQLStatementParser;
import com.alibaba.polardbx.druid.sql.visitor.ParameterizedOutputVisitorUtils;
import com.alibaba.polardbx.druid.sql.visitor.SQLASTOutputVisitor;
import com.alibaba.polardbx.druid.util.JdbcConstants;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenshao on 16/8/23.
 */
public class MySqlParameterizedOutputVisitorTest_23 extends TestCase {
    public void test_for_parameterize() throws Exception {
        final DbType dbType = JdbcConstants.MYSQL;

        String sql = "select `wmc_xxx_s`.fid from `wmc_xxx_s_0479` as `wmc_xxx_s` where `wmc_xxx_s`.fid = 3";

        String psql = ParameterizedOutputVisitorUtils.parameterize(sql, dbType);
        assertEquals("SELECT `wmc_xxx_s`.fid\n" +
                "FROM wmc_xxx_s `wmc_xxx_s`\n" +
                "WHERE `wmc_xxx_s`.fid = ?", psql);

        SQLStatementParser parser = SQLParserUtils.createSQLStatementParser(psql, dbType);
        List<SQLStatement> stmtList = parser.parseStatementList();

        StringBuilder out = new StringBuilder();
        SQLASTOutputVisitor visitor = SQLUtils.createOutputVisitor(out, JdbcConstants.MYSQL);
        List<Object> parameters = new ArrayList<Object>();
        visitor.setParameterized(true);
        visitor.setParameterizedMergeInList(true);
        visitor.setParameters(parameters);
        visitor.setExportTables(true);
        /*visitor.setPrettyFormat(false);*/

        SQLStatement stmt = stmtList.get(0);
        stmt.accept(visitor);

        // System.out.println(parameters);
        assertEquals(0, parameters.size());

        StringBuilder buf = new StringBuilder();
        SQLASTOutputVisitor visitor1 = SQLUtils.createOutputVisitor(buf, dbType);
        visitor1.addTableMapping("wmc_xxx_s", "wmc_xxx_s_0479");
        visitor1.setParameters(visitor.getParameters());
        stmt.accept(visitor1);

        assertEquals("SELECT `wmc_xxx_s`.fid\n" +
                "FROM wmc_xxx_s_0479 `wmc_xxx_s`\n" +
                "WHERE `wmc_xxx_s`.fid = ?", buf.toString());
    }
}
