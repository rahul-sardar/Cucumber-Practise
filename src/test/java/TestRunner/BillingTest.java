package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/billingError.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty"},
		monochrome = true
		)
public class BillingTest {

}
