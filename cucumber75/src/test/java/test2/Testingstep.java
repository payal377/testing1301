package test2;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\payal.rawat\\eclipse-workspace\\cucumber75\\src\\test\\java\\test2\\feat1.feature"},
glue="test2",
tags="@tag2",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json"
	}

		)

public class Testingstep extends AbstractTestNGCucumberTests {
  @Test
  public void f() {
  }
}
