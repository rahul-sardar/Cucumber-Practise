package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Search.feature"},
		glue = {"StepDefinition" , "MyHooks"},
		plugin = {"pretty"},
		monochrome = true
		)
public class AmazonHookTest {
	
	

}
