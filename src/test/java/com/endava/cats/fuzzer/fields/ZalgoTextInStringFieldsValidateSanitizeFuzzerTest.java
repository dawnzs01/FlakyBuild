package com.endava.cats.fuzzer.fields;

import com.endava.cats.args.FilesArguments;
import com.endava.cats.http.ResponseCodeFamily;
import com.endava.cats.io.ServiceCaller;
import com.endava.cats.model.FuzzingData;
import com.endava.cats.strategy.FuzzingStrategy;
import com.endava.cats.report.TestCaseListener;
import com.endava.cats.util.CatsUtil;
import io.quarkus.test.junit.QuarkusTest;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

@QuarkusTest
class ZalgoTextInStringFieldsValidateSanitizeFuzzerTest {
    private final CatsUtil catsUtil = new CatsUtil();
    private ZalgoTextInFieldsValidateSanitizeFuzzer zalgoTextInStringFieldsValidateSanitizeFuzzer;

    @BeforeEach
    void setup() {
        ServiceCaller serviceCaller = Mockito.mock(ServiceCaller.class);
        TestCaseListener testCaseListener = Mockito.mock(TestCaseListener.class);
        FilesArguments filesArguments = Mockito.mock(FilesArguments.class);
        zalgoTextInStringFieldsValidateSanitizeFuzzer = new ZalgoTextInFieldsValidateSanitizeFuzzer(serviceCaller, testCaseListener, catsUtil, filesArguments);
        Mockito.when(testCaseListener.isFieldNotADiscriminator(Mockito.anyString())).thenReturn(true);
        Mockito.when(testCaseListener.isFieldNotADiscriminator("pet#type")).thenReturn(false);
    }

    @Test
    void shouldProperlyOverrideSuperClassMethods() {
        FuzzingData data = Mockito.mock(FuzzingData.class);
        Map<String, Schema> reqTypes = new HashMap<>();
        reqTypes.put("field", new StringSchema());
        Mockito.when(data.getRequestPropertyTypes()).thenReturn(reqTypes);
        FuzzingStrategy fuzzingStrategy = zalgoTextInStringFieldsValidateSanitizeFuzzer.getFieldFuzzingStrategy(data, "field").get(0);

        Assertions.assertThat(fuzzingStrategy.getData().toString()).contains(" ̵̡̡̢̡̨̨̢͚̬̱̤̰̗͉͚̖͙͎͔͔̺̳͕̫̬͚̹͖̬̭̖̪̗͕̜̣̥̣̼͍͉̖͍̪͈̖͚̙͛͒͂̎̊̿̀̅̈͌͋̃̾̈̾̇͛͌͘͜͜͠͝ͅͅͅ ̷͕̗̇͛̅̀̑̇̈͗͌͛̐̀͆̐̊̅̋̈́̂̈́̈́͑̓͂͂̌̈́̽͌͐̐͂͐̈́̍̂͗̂͘͠͝͝͝ͅ ".replace(" ", ""));
        Assertions.assertThat(zalgoTextInStringFieldsValidateSanitizeFuzzer.getExpectedHttpCodeWhenFuzzedValueNotMatchesPattern()).isEqualTo(ResponseCodeFamily.FOURXX);
        Assertions.assertThat(zalgoTextInStringFieldsValidateSanitizeFuzzer.getExpectedHttpCodeWhenOptionalFieldsAreFuzzed()).isEqualTo(ResponseCodeFamily.FOURXX);
        Assertions.assertThat(zalgoTextInStringFieldsValidateSanitizeFuzzer.getExpectedHttpCodeWhenRequiredFieldsAreFuzzed()).isEqualTo(ResponseCodeFamily.FOURXX);
        Assertions.assertThat(zalgoTextInStringFieldsValidateSanitizeFuzzer.description()).isNotNull();
        Assertions.assertThat(zalgoTextInStringFieldsValidateSanitizeFuzzer.typeOfDataSentToTheService()).isNotNull();
    }

    @Test
    void shouldNotFuzzIfDiscriminatorField() {
        Assertions.assertThat(zalgoTextInStringFieldsValidateSanitizeFuzzer.isFuzzerWillingToFuzz(null, "pet#type")).isFalse();
    }

    @Test
    void shouldFuzzIfNotDiscriminatorField() {
        Assertions.assertThat(zalgoTextInStringFieldsValidateSanitizeFuzzer.isFuzzerWillingToFuzz(null, "pet#number")).isTrue();
    }
}
