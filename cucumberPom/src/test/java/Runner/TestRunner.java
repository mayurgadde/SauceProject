package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features/SauceLabs.feature"
		,glue={"stepDefs"},
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		monochrome= true
		//tags="@regression"
		)


public class TestRunner {

}
