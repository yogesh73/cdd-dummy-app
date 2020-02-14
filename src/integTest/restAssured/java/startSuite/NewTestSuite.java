package startSuite;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import Utils.LocalTestConfig;

@DisplayName("A new Testing suite for the most amazing strategy ever")
public class NewTestSuite extends LocalTestConfig{

    @DisplayName("Agent accept start and stop but No Test Suites Executed")
    @Test
    public void thisIsANewTest() throws InterruptedException {

        Thread.sleep(3000);
    }
}