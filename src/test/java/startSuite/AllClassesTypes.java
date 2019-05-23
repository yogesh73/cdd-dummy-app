package startSuite;

import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import rest.assured.shared.config.TestConfig;

@DisplayName("Monitoring of different class types")
public class AllClassesTypes extends TestConfig{

    @DisplayName("Operate All classes in dummy Application")
    @Test
    public void allLibrariesExists() throws InterruptedException {

        Thread.sleep(3000);
        TEmulatorUtils.executeAllOperations();

    }

}
