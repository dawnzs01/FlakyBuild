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

package com.tencent.cloud.polaris.config.adapter;

import java.util.List;

import com.tencent.cloud.polaris.config.config.ConfigFileGroup;
import com.tencent.cloud.polaris.config.config.PolarisConfigProperties;
import com.tencent.cloud.polaris.context.config.PolarisContextProperties;
import com.tencent.polaris.configuration.api.core.ConfigFileService;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.util.CollectionUtils;

/**
 * Spring cloud reserved core configuration loading SPI.
 * <p>
 * This SPI is implemented to interface with Polaris configuration center
 *
 * @author lepdou 2022-03-10
 */
@Order(0)
public class PolarisConfigFileLocator implements PropertySourceLocator {

	private static final String POLARIS_CONFIG_PROPERTY_SOURCE_NAME = "polaris-config";

	private final PolarisConfigProperties polarisConfigProperties;

	private final PolarisConfigFilePuller polarisConfigFilePuller;

	public PolarisConfigFileLocator(PolarisConfigProperties polarisConfigProperties,
			PolarisContextProperties polarisContextProperties, ConfigFileService configFileService,
			PolarisPropertySourceManager polarisPropertySourceManager, Environment environment) {
		this.polarisConfigProperties = polarisConfigProperties;
		this.polarisConfigFilePuller = PolarisConfigFilePuller.get(polarisContextProperties, configFileService,
				polarisPropertySourceManager);
	}

	@Override
	public PropertySource<?> locate(Environment environment) {
		CompositePropertySource compositePropertySource = new CompositePropertySource(
				POLARIS_CONFIG_PROPERTY_SOURCE_NAME);

		// load spring boot default config files
		String[] activeProfiles = environment.getActiveProfiles();
		String[] defaultProfiles = environment.getDefaultProfiles();
		String serviceName = environment.getProperty("spring.application.name");
		polarisConfigFilePuller.initInternalConfigFiles(
				compositePropertySource, activeProfiles, defaultProfiles, serviceName);

		// load custom config files
		List<ConfigFileGroup> configFileGroups = polarisConfigProperties.getGroups();
		if (CollectionUtils.isEmpty(configFileGroups)) {
			return compositePropertySource;
		}
		polarisConfigFilePuller.initCustomPolarisConfigFiles(compositePropertySource, configFileGroups);
		return compositePropertySource;
	}
}
