package tech.cassandre.trading.bot.test.core.configuration.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import tech.cassandre.trading.bot.test.CassandreTradingBot;
import tech.cassandre.trading.bot.test.util.junit.configuration.Configuration;
import tech.cassandre.trading.bot.test.util.junit.configuration.Property;
import tech.cassandre.trading.bot.util.exception.ConfigurationException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static tech.cassandre.trading.bot.test.core.strategy.multiple.Strategy1.PARAMETER_STRATEGY_1_ENABLED;
import static tech.cassandre.trading.bot.test.core.strategy.multiple.Strategy2.PARAMETER_STRATEGY_2_ENABLED;
import static tech.cassandre.trading.bot.test.core.strategy.multiple.Strategy3.PARAMETER_STRATEGY_3_ENABLED;
import static tech.cassandre.trading.bot.test.util.strategies.InvalidStrategy.PARAMETER_INVALID_STRATEGY_ENABLED;
import static tech.cassandre.trading.bot.test.util.strategies.NoTradingAccountStrategy.PARAMETER_NO_TRADING_ACCOUNT_STRATEGY_ENABLED;
import static tech.cassandre.trading.bot.test.util.strategies.TestableCassandreStrategy.PARAMETER_TESTABLE_STRATEGY_ENABLED;

@DisplayName("Configuration - Strategy - Invalid trade account")
@Configuration({
        @Property(key = PARAMETER_INVALID_STRATEGY_ENABLED, value = "false"),
        @Property(key = PARAMETER_TESTABLE_STRATEGY_ENABLED, value = "false"),
        @Property(key = PARAMETER_NO_TRADING_ACCOUNT_STRATEGY_ENABLED, value = "true"),
        @Property(key = PARAMETER_STRATEGY_1_ENABLED, value = "true"),
        @Property(key = PARAMETER_STRATEGY_2_ENABLED, value = "true"),
        @Property(key = PARAMETER_STRATEGY_3_ENABLED, value = "true"),
})
public class InvalidTradeAccountTest {

    @Test
    @DisplayName("Check error messages")
    public void checkErrorMessages() {
        try {
            SpringApplication application = new SpringApplication(CassandreTradingBot.class);
            application.run();
            fail("Exception not raised");
        } catch (Exception e) {
            assertTrue(e.getCause() instanceof ConfigurationException);
            assertTrue(e.getCause().getMessage().contains("Your strategies specify a trading account that doesn't exist"));
        }
    }

}
