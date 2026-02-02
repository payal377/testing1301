package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/featurenew"},
glue="stepdefinitionnew",
tags="@tag1",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-reports/CucumberTestReport.xml"
	}
 
 )
public class smoketestnew extends AbstractTestNGCucumberTests{

}