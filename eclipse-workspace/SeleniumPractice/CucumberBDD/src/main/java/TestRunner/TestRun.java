package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "classpath:login.feature", 
	    glue = {"Stepdefination"}
	)
public class TestRun {
    // No main() required – JUnit runs this runner
}
