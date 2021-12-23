package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//CRMFeatures//",
		glue = {"stepDefs"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty"}
		)
public class LoginRunner {

}
