package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/main/resources/featureFiles"},
        plugin = {"html:target/ReportDestination", "pretty",},
        tags = {"@tag"},
         glue = {"step_def"}
)

public class TestRunner {
}
