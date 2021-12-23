package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedFeatures//",
		glue = {"stepDefs"},
		dryRun=false,
		monochrome=true,
//		tags="@RegressionTest"
//		tags="@SmokeTest"
//		tags="@RegressionTest or @SmokeTest"
//		tags="@RegressionTest and @SmokeTest"
//		tags="not @RegressionTest and not @SmokeTest"
		
//		tags="@PhaseOne and @RegressionTest"
//		tags="@PhaseOne and @RegressionTest or @SmokeTest"
//		tags="@RegressionTest and not @PhaseOne"
//		tags="@PhaseOne and @RegressionTest or @PhaseTwo and @SmokeTest"
		tags="@PhaseTwo"
			
	)
public class TaggedRunner {

}
