package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/findDirections.feature",
        glue = {"tests.StepDefinitions"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
