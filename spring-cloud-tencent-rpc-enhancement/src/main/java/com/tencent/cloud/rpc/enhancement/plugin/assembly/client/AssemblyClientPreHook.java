/*
 * Tencent is pleased to support the open source community by making Spring Cloud Tencent available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.cloud.rpc.enhancement.plugin.assembly.client;

import com.tencent.cloud.common.metadata.MetadataContext;
import com.tencent.cloud.rpc.enhancement.plugin.EnhancedPlugin;
import com.tencent.cloud.rpc.enhancement.plugin.EnhancedPluginContext;
import com.tencent.cloud.rpc.enhancement.plugin.EnhancedPluginType;
import com.tencent.cloud.rpc.enhancement.plugin.assembly.AssemblyMetadataProvider;
import com.tencent.cloud.rpc.enhancement.plugin.assembly.AssemblyRequestContext;
import com.tencent.polaris.api.pojo.ServiceKey;
import com.tencent.polaris.assembly.api.AssemblyAPI;
import com.tencent.polaris.assembly.api.pojo.BeforeRequest;
import com.tencent.polaris.assembly.api.pojo.Capability;

import static com.tencent.cloud.rpc.enhancement.plugin.PluginOrderConstant.ClientPluginOrder.ASSEMBLY_PLUGIN_ORDER;

/**
 * AssemblyClientPreHook.
 *
 * @author sean yu
 */
public class AssemblyClientPreHook implements EnhancedPlugin {

	private final AssemblyAPI assemblyAPI;

	public AssemblyClientPreHook(AssemblyAPI assemblyAPI) {
		this.assemblyAPI = assemblyAPI;
	}

	@Override
	public EnhancedPluginType getType() {
		return EnhancedPluginType.Client.PRE;
	}

	@Override
	public void run(EnhancedPluginContext context) {

		BeforeRequest beforeRequest = new BeforeRequest();
		beforeRequest.setCapabilities(new Capability[]{Capability.ALL});
		beforeRequest.setRequestContext(new AssemblyRequestContext(
				context.getRequest(),
				new ServiceKey(MetadataContext.LOCAL_NAMESPACE, context.getLocalServiceInstance().getServiceId()),
				context.getLocalServiceInstance().getHost()
		));
		beforeRequest.setMetadataProvider(new AssemblyMetadataProvider(context.getLocalServiceInstance(), MetadataContext.LOCAL_NAMESPACE));
		// TargetService only exist in client side
		beforeRequest.setTargetService(new ServiceKey(MetadataContext.LOCAL_NAMESPACE, context.getTargetServiceInstance().getServiceId()));

		assemblyAPI.beforeCallService(beforeRequest);
	}

	@Override
	public int getOrder() {
		return ASSEMBLY_PLUGIN_ORDER;
	}

}
