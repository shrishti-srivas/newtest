package POMcucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "features\\LoginPOM.Feature",
		glue = {"StepDefintion"},
		plugin= {"json:target/cucumber-reports/POMLogin.json"}
		)

public class pomRunner {

}
