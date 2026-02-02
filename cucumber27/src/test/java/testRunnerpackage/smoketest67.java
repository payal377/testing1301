package testRunnerpackage;


public class smoketest67{
	@CucumberOptions(features= {"src//test//java//featurefile"},
			glue="stepdefinition",
			tags="@tag2",

			plugin= {
					"pretty",
					"html:target/cucumber-reports/cucumber.html",
					"json:target/cucumber-reports/CucumberTestReport.json",
					"junit:target/cucumber-reports/CucumberTestReport.xml"
					
				}
			 
			 
)
public class smoketest67 extends AbstractTestNGCucumberTests{

			}


}
