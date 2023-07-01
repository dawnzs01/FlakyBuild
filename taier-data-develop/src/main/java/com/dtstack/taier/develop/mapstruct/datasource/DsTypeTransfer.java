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

package com.dtstack.taier.develop.mapstruct.datasource;


import com.dtstack.taier.dao.domain.DsType;
import com.dtstack.taier.develop.vo.datasource.DsTypeListVO;
import com.dtstack.taier.develop.vo.datasource.DsTypeVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DsTypeTransfer {

    DsTypeTransfer INSTANCE = Mappers.getMapper(DsTypeTransfer.class);


    @Mapping(source = "id",target = "typeId")
    DsTypeVO toInfoVO(DsType dsType);

    List<DsTypeListVO> toDsTypeListVOs(List<DsType> dsTypeList);


}
