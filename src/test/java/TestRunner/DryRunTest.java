package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = {"src/test/resources/AppFeature/dryrun.feature"}
   ,glue={"StepDefinition"}
   ,dryRun = false
   //,dryRun = true
)
public class DryRunTest {

	//Check Output when u run by passing Dryrun as true and false
	//when u pass true it will just check for every step in feature file there is a method 
	//in step definition
	
	
}
