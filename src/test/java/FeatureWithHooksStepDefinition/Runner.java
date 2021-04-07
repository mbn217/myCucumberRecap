package FeatureWithHooksStepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureTags",glue={"FeatureTagsStepDefinition"},
	monochrome=true,
	plugin = {"pretty", "junit:target/JUnitReports/report.xml",
			"json:target/JSONReports/report.json",
			"html:target/HtmlReports"},
	tags= {"@smoke or @regression"}
		
		)
public class Runner {	

}
