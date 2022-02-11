package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.TestUtil;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/loginFeature.feature"},
        glue ={"steps"},/*plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}, tags = {
				"@Test*/ publish = true)
public class cucumberJunitRunner {

    /*@AfterClass
    public static void writeExtentReport() {
      //  Reporter.loadXMLConfig(new File(TestUtil.configExtentPath));
    }
*/
}
