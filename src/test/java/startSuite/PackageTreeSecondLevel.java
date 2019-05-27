package startSuite;

import Utils.Library;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import Utils.LocalTestConfig;

@DisplayName("Monitoring of different class types")
public class PackageTreeSecondLevel extends LocalTestConfig{

    @DisplayName("Test Suite operate class on Packages tree under Second Level")
    @Test
    public void secondLevelExistInFiles() throws InterruptedException {

        Thread.sleep(3000);
        TEmulatorUtils.executeOperation(Library.SECOND_LEVEL_PKG_CLASS);
    }
}
