package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Uber.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty",
				  "json:target/MyCucumberReports/report.json" ,
				  "junit:target/MyCucumberReports/report.xml"},
		//publish= true, //It is Used to generate reports on cumcumber server
		monochrome = true
		)
public class UberTest {

}
