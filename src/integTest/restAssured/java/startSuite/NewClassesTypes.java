package startSuite;

import Utils.LocalTestConfig;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

@DisplayName("Monitoring of different class types 2")
public class NewClassesTypes extends LocalTestConfig {

    @DisplayName("Operate All classes in dummy Application 2")
    @Test
    public void allLibrariesExists() throws InterruptedException {

        Thread.sleep(1500);
        TEmulatorUtils.executeAllOperations();

        Thread.sleep(1500);
    }
}
