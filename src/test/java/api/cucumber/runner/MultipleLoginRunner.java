package api.cucumber.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/api/cucumber/feature/loginwiththeexample.feature"},glue ={"steps"},
        dryRun = false)

public class MultipleLoginRunner {
}
