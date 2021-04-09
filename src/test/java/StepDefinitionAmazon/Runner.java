package StepDefinitionAmazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeaturesAmazon",glue={"StepDefinitionAmazon"},
	monochrome=true,
	plugin = {"pretty", "junit:target/JUnitReports/report.xml",
			"json:target/JSONReports/report.json",
			"html:target/HtmlReports"}
		
		)
public class Runner {	

}
