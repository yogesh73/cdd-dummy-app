package startSuite;

import Utils.Library;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import rest.assured.shared.config.TestConfig;

@DisplayName("Monitoring of different class types")
public class MultiThread extends TestConfig{

    @DisplayName("Test Suite operate Multi Thread Classes")
    @Test
    public void multithreadSuites() throws InterruptedException {

        Thread.sleep(3000);
        TEmulatorUtils.executeOperation(Library.MULTI_THREAD);

    }

}
