package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
         features = {"src/test/resources/features"},
         glue = "steps",
         tags = "@WikipediaL",
         dryRun = false,
        monochrome = false
)
public class Runner {
}
