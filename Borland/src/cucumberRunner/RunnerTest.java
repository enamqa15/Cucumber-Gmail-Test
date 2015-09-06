package cucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "json:target/cucumber.json" }, 
features = { "src/cucumber/" }

)
public class RunnerTest {

}
