package io.riskscanner.commons.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.env.Environment;

/**
 * @ClassName GlobalConfigurations
 * @Author maguohao
 **/
public class GlobalConfigurations {

    private static Environment environment;

    public GlobalConfigurations(Environment environment) {
        GlobalConfigurations.environment = environment;
    }

    public static boolean isReleaseMode() {
        return StringUtils.equals(environment.getProperty("run.mode", "local"), "release");
    }

    public static String getCookieName() {
        return environment.getProperty("fit2cloud.cookie-name", "FIT2CLOUD_SESSION_ID");
    }

    public static <T> T getProperty(String key, Class<T> targetType, T defaultValue) {
        return environment.getProperty(key, targetType, defaultValue);
    }

}
