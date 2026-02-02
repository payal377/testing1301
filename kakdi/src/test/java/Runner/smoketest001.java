package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//java//feature05"},
glue="stepdefinition",
tags="@tag1",

plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-reports/CucumberTestReport.xml"
	}
 
 
)
public class smoketest001 extends AbstractTestNGCucumberTests{

}