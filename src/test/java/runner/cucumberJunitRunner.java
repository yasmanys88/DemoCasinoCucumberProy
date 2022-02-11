package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/loginFeature.feature"},
        glue ={"steps"}, publish = true)
public class cucumberJunitRunner {
}
