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

package com.dtstack.taier.develop.service.template.bulider.writer;

import com.dtstack.taier.datasource.api.source.DataSourceType;
import com.dtstack.taier.develop.service.template.kafka.Kafka2XWriter;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Date: 2020/06/28
 * Company: www.dtstack.com
 * @author wangchuan
 */

@Component
public class Kafka2XWriterBuilder extends KafkaBaseWriterBuilder {

    @Override
    public Kafka2XWriter createKafkaWriter(Map<String, Object> sourceMap) {
        return new Kafka2XWriter();
    }

    @Override
    public DataSourceType getDataSourceType() {
        return DataSourceType.KAFKA_2X;
    }
}
