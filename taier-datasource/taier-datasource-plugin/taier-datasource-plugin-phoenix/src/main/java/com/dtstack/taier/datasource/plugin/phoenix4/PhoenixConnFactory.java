/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.taier.datasource.plugin.phoenix4;

import com.dtstack.taier.datasource.plugin.rdbms.ConnFactory;
import com.dtstack.taier.datasource.api.source.DataBaseType;
import lombok.extern.slf4j.Slf4j;

/**
 * @company: www.dtstack.com
 * @Author ：Nanqi
 * @Date ：Created in 15:51 2020/2/27
 * @Description：默认 Phoenix 连接工厂
 */
@Slf4j
public class PhoenixConnFactory extends ConnFactory {

    public PhoenixConnFactory() {
        this.driverName = DataBaseType.Phoenix.getDriverClassName();
        this.testSql = DataBaseType.Phoenix.getTestSql();
        this.errorPattern = new PhoenixErrorPattern();
    }
}
