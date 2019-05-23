package startSuite;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import rest.assured.shared.config.TestConfig;

@DisplayName("Monitoring of different class types")
public class NoTestWereRunning extends TestConfig{

    @DisplayName("Agent accept start and stop but No Test Suites Executed")
    @Test
    public void notTestSuitesExecuted() throws InterruptedException {

        Thread.sleep(3000);

    }
}
