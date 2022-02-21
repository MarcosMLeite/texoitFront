package texoFront;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		monochrome = true,

		features = "src/test/resources/features/",

		glue = "texoFront",

		tags = "@executa",

		plugin = { "pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm" },

		dryRun = false)
public class Test {

}
