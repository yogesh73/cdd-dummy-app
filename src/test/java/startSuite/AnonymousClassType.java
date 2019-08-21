package startSuite;

import Utils.Library;
import Utils.TEmulatorUtils;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import Utils.LocalTestConfig;

@DisplayName("Monitoring of different class types")
public class AnonymousClassType extends LocalTestConfig{

    @DisplayName("Test Suite operate class type Anonymous Class")
    @Test
    public void anonymousClassExistInFiles() throws InterruptedException {
        Thread.sleep(1500);
      
        
        TEmulatorUtils.executeOperation(Library.ANONYMOUS_CLASS);
        Thread.sleep(1500);
    }
}
// test111111

// Recently Modified tests suites App Wc2cC
// Recently Modified tests suites App UF8Kb