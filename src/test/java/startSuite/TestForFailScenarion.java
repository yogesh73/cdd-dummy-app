package startSuite;

import Utils.Library;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import rest.assured.shared.config.TestConfig;

@DisplayName("Monitoring of different class types")
public class TestForFailScenarion extends TestConfig{

    @DisplayName("Test For Validating Fail Heuristic")
    @Test
    public void comicsLibraryClassExist() throws InterruptedException {

        Thread.sleep(3000);
        TEmulatorUtils.executeOperation(Library.FAIL_SCENARIO);
    }
}
