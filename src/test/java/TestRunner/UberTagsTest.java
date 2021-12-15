package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Uber.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty"},
		//tags ="@Smoke" ,
		//tags ="@Regression" ,
		//tags = "@Regression or @Smoke" ,
		//tags = "@Regression and @Smoke" ,
	    //tags = " not @Smoke" ,
		tags = "@All" ,
		monochrome = true
		)
public class UberTagsTest {

}
