package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ola.feature",
				glue = {"StepDefination","Utilities"},
				dryRun = false,
				monochrome = true,
				//tags = {"@ibmdemo","@smoke"},//AND condition for two tags
				//tags = {"@ibmdemo,@smoke"},//OR condition for two tags
				//tags = {"~@ibmdemo,~@smoke"},//~ To skip the test
				
				//tags = "@SC05",

				plugin = {"pretty", "html:target/cucumber-pretty"}
				
		)

public class TestRunner {
	

}
