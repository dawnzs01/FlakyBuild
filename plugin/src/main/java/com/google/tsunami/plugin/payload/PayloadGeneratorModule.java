/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.tsunami.plugin.payload;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import com.google.common.net.InetAddresses;
import com.google.common.net.InternetDomainName;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.protobuf.util.JsonFormat;
import com.google.tsunami.common.net.http.HttpClient;
import com.google.tsunami.plugin.TcsClient;
import com.google.tsunami.plugin.TcsClientCliOptions;
import com.google.tsunami.plugin.TcsConfigProperties;
import com.google.tsunami.proto.PayloadDefinition;
import com.google.tsunami.proto.PayloadGeneratorConfig;
import com.google.tsunami.proto.PayloadLibrary;
import com.google.tsunami.proto.PayloadValidationType;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.inject.Qualifier;
import javax.inject.Singleton;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

/** Guice module for installing {@link PayloadGenerator}. */
public final class PayloadGeneratorModule extends AbstractModule {
  private final SecureRandom secureRng;

  public PayloadGeneratorModule(SecureRandom secureRng) {
    this.secureRng = secureRng;
  }

  @Qualifier
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
  @interface CallbackAddress {}

  @Qualifier
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
  @interface CallbackPort {}

  @Qualifier
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
  @interface CallbackPollingUri {}

  @Provides
  @CallbackAddress
  String providesCallbackAddress(TcsConfigProperties config, TcsClientCliOptions cliOptions) {

    if (cliOptions.callbackAddress != null) {
      return cliOptions.callbackAddress;
    }
    return config.callbackAddress;
  }

  @Provides
  @CallbackPort
  Integer providesCallbackPort(TcsConfigProperties config, TcsClientCliOptions cliOptions) {
    if (cliOptions.callbackPort != null) {
      return cliOptions.callbackPort;
    }
    return config.callbackPort;
  }

  @Provides
  @CallbackPollingUri
  String providesCallbackPollingUri(TcsConfigProperties config, TcsClientCliOptions cliOptions) {
    if (cliOptions.pollingUri != null) {
      return cliOptions.pollingUri;
    }
    return config.pollingUri;
  }

  @Provides
  TcsClient providesTcsClient(
      @Nullable @CallbackAddress String callbackAddress,
      @Nullable @CallbackPort Integer callbackPort,
      @Nullable @CallbackPollingUri String pollingUri,
      HttpClient httpClient) {
    // when all tcs config are not set, we provide an invalid {@link TcsClient}
    // so that {@link TcsClient#isCallbackServerEnabled} returns false.
    if (callbackAddress == null && callbackPort == null && pollingUri == null) {
      return new TcsClient("", 0, "", checkNotNull(httpClient));
    }

    checkNotNull(callbackAddress);
    checkNotNull(callbackPort);
    checkNotNull(pollingUri);
    checkArgument(
        InetAddresses.isInetAddress(callbackAddress) || InternetDomainName.isValid(callbackAddress),
        "Invalid callback address specified");
    checkArgument(callbackPort > 0 && callbackPort < 65536, "Invalid port number specified");

    return new TcsClient(callbackAddress, callbackPort, pollingUri, checkNotNull(httpClient));
  }

  @Provides
  PayloadSecretGenerator providesPayloadSecretGenerator() {
    return new PayloadSecretGenerator(this.secureRng);
  }

  @Provides
  @PayloadGenerator.Payloads
  @Singleton
  ImmutableList<PayloadDefinition> provideParsedPayloads() throws IOException {
    // It is only safe to use SnakeYaml with SafeConstructor.
    // Parse the YAML by converting it into JSON and then into the proto message
    Yaml yaml = new Yaml(new SafeConstructor(new LoaderOptions()));
    Map<String, Object> rawYamlData =
        yaml.load(
            Resources.toString(
                Resources.getResource(this.getClass(), "payload_definitions.yaml"),
                UTF_8));

    Gson gson = new Gson();
    String json = gson.toJson(rawYamlData);

    PayloadLibrary.Builder builder = PayloadLibrary.newBuilder();
    JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
    PayloadLibrary parsed = builder.build();

    return validatePayloads(parsed.getPayloadsList());
  }

  /** Validates that the parsed payloads adhere to the defined schema. */
  ImmutableList<PayloadDefinition> validatePayloads(List<PayloadDefinition> payloads) {
    for (PayloadDefinition p : payloads) {
      checkArgument(p.hasName(), "Parsed payload does not have a name.");
      checkArgument(
          p.getInterpretationEnvironment()
              != PayloadGeneratorConfig.InterpretationEnvironment
                  .INTERPRETATION_ENVIRONMENT_UNSPECIFIED,
          "Parsed payload does not have an interpretation_environment.");
      checkArgument(
          p.getExecutionEnvironment()
              != PayloadGeneratorConfig.ExecutionEnvironment.EXECUTION_ENVIRONMENT_UNSPECIFIED,
          "Parsed payload does not have an exeuction_environment.");
      checkArgument(
          !p.getVulnerabilityTypeList().isEmpty(),
          "Parsed payload has no entries for vulnerability_type.");
      checkArgument(p.hasPayloadString(), "Parsed payload does not have a payload_string.");

      if (p.getUsesCallbackServer().getValue()) {
        checkArgument(
            p.getPayloadString().getValue().contains("$TSUNAMI_PAYLOAD_TOKEN_URL"),
            "Parsed payload uses callback server but $TSUNAMI_PAYLOAD_TOKEN_URL not found in"
                + " payload_string.");
      } else {
        checkArgument(
            p.getValidationType() != PayloadValidationType.VALIDATION_TYPE_UNSPECIFIED,
            "Parsed payload has no validation_type and does not use the callback server.");

        if (p.getValidationType() == PayloadValidationType.VALIDATION_REGEX) {
          checkArgument(
              p.hasValidationRegex(),
              "Parsed payload has no validation_regex but uses PayloadValidationType.REGEX");
        }
      }
    }

    return ImmutableList.copyOf(payloads);
  }
}
