package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/registration.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty" ,
				  "json:target/MyCucumberReports/report.json" ,
				  "junit:target/MyCucumberReports/report.xml" },
		monochrome = true
		)
public class UserRegTest {

}
