package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber/report.html",
                "summary",
                "json:target/cucumber-reports/Cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
        , features = {"src/test/resources/features/"}
        , glue = {"stepDef"}
        , snippets = CAMELCASE
        , dryRun = false
        , monochrome = true
        , tags = "not @quarantine or not @wip"
)


public class MyRunnerTest {
    // Test runner class, for developer's convenience to run specific test cases in local
}
