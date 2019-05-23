package startSuite;

import Utils.Library;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import rest.assured.shared.config.TestConfig;

@DisplayName("Monitoring of different class types")
public class ComicsLibraryClass extends TestConfig{

    @DisplayName("Test Suite operate class with name ComicsLibrary")
    @Test
    public void comicsLibraryClassExist() throws InterruptedException {

        Thread.sleep(3000);
        TEmulatorUtils.executeOperation(Library.COMICS_LIBRARY);

    }
}
