package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src//main//java//Features",
			 glue="StepDef"
			 //plugin ={ "pretty",
					// "json: target/MyReport/report.json",
					// "junit: target/MyReport/report.xml"}
			)
			
	public class RunnerClass {	
		
	
}
