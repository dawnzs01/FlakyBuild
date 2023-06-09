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

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.inject.Guice;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.google.tsunami.common.net.http.HttpClient;
import com.google.tsunami.common.net.http.HttpClientModule;
import com.google.tsunami.plugin.TcsClient;
import com.google.tsunami.plugin.TcsClientCliOptions;
import com.google.tsunami.plugin.TcsConfigProperties;
import com.google.tsunami.proto.PayloadDefinition;
import com.google.tsunami.proto.PayloadGeneratorConfig.ExecutionEnvironment;
import com.google.tsunami.proto.PayloadGeneratorConfig.InterpretationEnvironment;
import com.google.tsunami.proto.PayloadGeneratorConfig.VulnerabilityType;
import com.google.tsunami.proto.PayloadValidationType;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/** Tests for {@link PayloadGeneratorModule} */
@RunWith(Parameterized.class)
public final class PayloadGeneratorModuleTest {
  private static final String DOMAIN_1 = "mydomain1.com";
  private static final Integer PORT_1 = 1111;
  private static final String POLLING_URI_1 = String.format("http://%s:%d", DOMAIN_1, PORT_1);

  private static final String DOMAIN_2 = "http://mydomain2.com:2222";
  private static final Integer PORT_2 = 2222;
  private static final String POLLING_URI_2 = String.format("http://%s:%d", DOMAIN_2, PORT_2);

  @Inject private HttpClient httpClient;

  private TcsClientCliOptions cliOptions;
  private TcsConfigProperties configProperties;

  private PayloadGeneratorModule module;

  private final PayloadDefinition.Builder goodCallbackDefinition =
      PayloadDefinition.newBuilder()
          .setName(StringValue.of("Test 1"))
          .setInterpretationEnvironment(InterpretationEnvironment.LINUX_SHELL)
          .setExecutionEnvironment(ExecutionEnvironment.EXEC_INTERPRETATION_ENVIRONMENT)
          .addVulnerabilityType(VulnerabilityType.REFLECTIVE_RCE)
          .setUsesCallbackServer(BoolValue.of(true))
          .setPayloadString(StringValue.of("curl $TSUNAMI_PAYLOAD_TOKEN_URL"));

  private final PayloadDefinition.Builder goodNoCallbackDefinition =
      PayloadDefinition.newBuilder()
          .setName(StringValue.of("Test 2"))
          .setInterpretationEnvironment(InterpretationEnvironment.LINUX_SHELL)
          .setExecutionEnvironment(ExecutionEnvironment.EXEC_INTERPRETATION_ENVIRONMENT)
          .addVulnerabilityType(VulnerabilityType.REFLECTIVE_RCE)
          .setUsesCallbackServer(BoolValue.of(false))
          .setPayloadString(StringValue.of("my payload"))
          .setValidationType(PayloadValidationType.VALIDATION_REGEX)
          .setValidationRegex(StringValue.of("myregex"));

  @Before
  public void setUp() {
    Guice.createInjector(new HttpClientModule.Builder().build()).injectMembers(this);
    this.module = new PayloadGeneratorModule(new SecureRandom());
    cliOptions = new TcsClientCliOptions();
    configProperties = new TcsConfigProperties();
  }

  @Test
  public void providesTcsClient_withNoConfig_returnsInvalidTcsClient() {
    TcsClient client = module.providesTcsClient(null, null, null, httpClient);

    assertFalse(client.isCallbackServerEnabled());
  }

  @Test
  public void providesTcsClient_withGoodConfig_returnsValidTcsClient() {
    TcsClient client = module.providesTcsClient(DOMAIN_1, PORT_1, POLLING_URI_1, httpClient);

    assertTrue(client.isCallbackServerEnabled());
  }

  @Test
  public void providesTcsClient_withConfigPropertiesAndCliOptions_prioritizesCliOptions() {
    configProperties.callbackAddress = DOMAIN_2;
    configProperties.callbackPort = PORT_2;
    configProperties.pollingUri = POLLING_URI_2;
    cliOptions.callbackAddress = DOMAIN_1;
    cliOptions.callbackPort = PORT_1;
    cliOptions.pollingUri = POLLING_URI_1;

    String callbackAddress = module.providesCallbackAddress(configProperties, cliOptions);
    Integer callbackPort = module.providesCallbackPort(configProperties, cliOptions);
    String pollingUri = module.providesCallbackPollingUri(configProperties, cliOptions);

    assertThat(callbackAddress).isEqualTo(DOMAIN_1);
    assertThat(callbackPort).isEqualTo(PORT_1);
    assertThat(pollingUri).isEqualTo(POLLING_URI_1);
  }

  @Parameter(0)
  public String callbackAddress;

  @Parameter(1)
  public Integer callbackPort;

  @Parameter(2)
  public String pollingUri;

  @Parameter(3)
  public Class<Throwable> exceptionClass;

  @Parameters
  public static List<Object[]> data() {
    return Arrays.asList(
        new Object[][] {
          {null, 1, "mydomain.com", NullPointerException.class},
          {"mydomain.com", null, "mydomain.com", NullPointerException.class},
          {"mydomain.com", 1, null, NullPointerException.class},
          {"mydomain.com", 0, "mydomain.com", IllegalArgumentException.class},
          {"a bad address", 1, "mydomain.com", IllegalArgumentException.class},
        });
  }

  @Test
  public void providesTcsClient_withBadConfig_throwsException() {
    assertThrows(
        this.exceptionClass,
        () ->
            module.providesTcsClient(
                this.callbackAddress, this.callbackPort, this.pollingUri, httpClient));
  }

  @Test
  public void provideParsedPayloads_returnsSomePayloads() throws IOException {
    ImmutableList<PayloadDefinition> payloads = module.provideParsedPayloads();

    assertThat(payloads).isNotEmpty();
  }

  @Test
  public void validatePayloads_withGoodPayloads_returnsPayloads() throws IOException {
    PayloadDefinition p0 = goodCallbackDefinition.build();
    PayloadDefinition p1 = goodNoCallbackDefinition.build();

    ImmutableList<PayloadDefinition> payloads = module.validatePayloads(ImmutableList.of(p0, p1));

    assertThat(payloads).containsExactly(p0, p1).inOrder();
  }

  @Test
  public void validatePayloads_withoutInterpretationEnvironment_throwsException()
      throws IOException {
    PayloadDefinition p = goodCallbackDefinition.clearInterpretationEnvironment().build();

    Throwable thrown =
        assertThrows(
            IllegalArgumentException.class, () -> module.validatePayloads(ImmutableList.of(p)));
    assertThat(thrown).hasMessageThat().contains("interpretation_environment");
  }

  @Test
  public void validatePayloads_withoutExecutionEnvironment_throwsException() throws IOException {
    PayloadDefinition p = goodCallbackDefinition.clearExecutionEnvironment().build();

    Throwable thrown =
        assertThrows(
            IllegalArgumentException.class, () -> module.validatePayloads(ImmutableList.of(p)));
    assertThat(thrown).hasMessageThat().contains("exeuction_environment");
  }

  @Test
  public void validatePayloads_withoutVulnerabilityType_throwsException() throws IOException {
    PayloadDefinition p = goodCallbackDefinition.clearVulnerabilityType().build();

    Throwable thrown =
        assertThrows(
            IllegalArgumentException.class, () -> module.validatePayloads(ImmutableList.of(p)));
    assertThat(thrown).hasMessageThat().contains("vulnerability_type");
  }

  @Test
  public void validatePayloads_withoutPayloadString_throwsException() throws IOException {
    PayloadDefinition p = goodCallbackDefinition.clearPayloadString().build();

    Throwable thrown =
        assertThrows(
            IllegalArgumentException.class, () -> module.validatePayloads(ImmutableList.of(p)));
    assertThat(thrown).hasMessageThat().contains("payload_string");
  }

  @Test
  public void validatePayloads_withCallbackPayloadWithoutUrlToken_throwsException()
      throws IOException {
    PayloadDefinition p =
        goodCallbackDefinition.setPayloadString(StringValue.of("my payload")).build();

    Throwable thrown =
        assertThrows(
            IllegalArgumentException.class, () -> module.validatePayloads(ImmutableList.of(p)));
    assertThat(thrown).hasMessageThat().contains("$TSUNAMI_PAYLOAD_TOKEN_URL");
  }

  @Test
  public void validatePayloads_withNoCallbackPayloadWithoutValidationType_throwsException()
      throws IOException {
    PayloadDefinition p = goodNoCallbackDefinition.clearValidationType().build();

    Throwable thrown =
        assertThrows(
            IllegalArgumentException.class, () -> module.validatePayloads(ImmutableList.of(p)));
    assertThat(thrown).hasMessageThat().contains("validation_type");
  }

  @Test
  public void validatePayloads_withRegexValidationWithoutValidationRegex_throwsException()
      throws IOException {
    PayloadDefinition p = goodNoCallbackDefinition.clearValidationRegex().build();

    Throwable thrown =
        assertThrows(
            IllegalArgumentException.class, () -> module.validatePayloads(ImmutableList.of(p)));
    assertThat(thrown).hasMessageThat().contains("validation_regex");
  }
}
