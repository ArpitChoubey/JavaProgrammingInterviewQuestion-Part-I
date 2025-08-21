package TestRunner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "classpath:E-com.feature", 
	    glue = {"EcommercePurchase"},
	    dryRun = false,    // To check the mapping is proper between Step Defination and Feature File 
	    // format = {"pretty", "html : test output"},// to generate different kind of reporting
	    strict = true,
	    // It will check if any step is not defined in Step Defination
	    tags = "Smoke",
	    plugin = "html : target/cucumber-reports/index.html",
	   monochrome = true  // display the output in a proper readable format 
	   
	   
	)

public class EcomRunner {

}
