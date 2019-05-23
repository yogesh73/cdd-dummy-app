package startSuite;

import Utils.Library;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import rest.assured.shared.config.TestConfig;

@DisplayName("Monitoring of different class types")
public class InnerClassType extends TestConfig{

    @DisplayName("Test Suite operate class type Inner Class")
    @Test
    public void innerClassExistInFiles() throws InterruptedException {

        Thread.sleep(3000);
        TEmulatorUtils.executeOperation(Library.INNERC_LASS_LIBRARY);

    }

}
