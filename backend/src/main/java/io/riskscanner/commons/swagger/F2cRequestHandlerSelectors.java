package io.riskscanner.commons.swagger;

import com.google.common.base.Predicate;
import io.riskscanner.commons.swagger.annotation.ApiHasModules;
import io.riskscanner.commons.swagger.annotation.ApiLackModules;
import springfox.documentation.RequestHandler;

import java.util.Arrays;

public class F2cRequestHandlerSelectors {

    public static Predicate<RequestHandler> withMethodAnnotationModules(String moduleId) {
        return input -> {
            if (input.isAnnotatedWith(ApiHasModules.class)) {
                ApiHasModules annotation = input.getHandlerMethod().getMethod().getAnnotation(ApiHasModules.class);
                return Arrays.asList(annotation.value()).contains(moduleId);
            } else if (input.isAnnotatedWith(ApiLackModules.class)) {
                ApiLackModules annotation = input.getHandlerMethod().getMethod().getAnnotation(ApiLackModules.class);
                return !Arrays.asList(annotation.value()).contains(moduleId);
            }
            return true;
        };
    }
}
