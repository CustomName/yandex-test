package my.task.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"my.task.steps", "my.task.hooks"},
        features = {"src/test/resources/features"}
)
public class RunTests {
}
