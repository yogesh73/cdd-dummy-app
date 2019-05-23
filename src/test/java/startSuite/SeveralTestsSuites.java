package startSuite;

import Utils.Library;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import rest.assured.shared.config.TestConfig;

@DisplayName("Monitoring of different class types")
public class SeveralTestsSuites extends TestConfig{

    @DisplayName("Send Several Tests Suites")
    @Test
    public void sentSeveralTestsSuites() throws InterruptedException {

        TEmulatorUtils.executeOperation(Library.COMICS_LIBRARY);

        TEmulatorUtils.executeOperation(Library.ANONYMOUS_CLASS);

        TEmulatorUtils.executeOperation(Library.INNERC_LASS_LIBRARY);

        Thread.sleep(3000);

        runOperationXtimes(2, Library.SECOND_LEVEL_PKG_CLASS);
    }

    private void runOperationXtimes (int numOfItr, Library operation) {
        for (int i=0; i < numOfItr; i++) {
            TEmulatorUtils.executeOperation(operation);
        }
    }
}
