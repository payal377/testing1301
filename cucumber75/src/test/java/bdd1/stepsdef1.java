package bdd1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepsdef1 {
	//background
//	@Given("a global administrator named")
//	public void presetup() {
//		System.out.println("background");
//	}
//	@Given("I am holding the calculator")
//	public void step1() {
//		System.out.println("I am holding the calculator");
//	}
//	@When("I enter the first number")
//	public void step2() {
//		System.out.println("I enter the first number");
//	}
//	@And("I click on + symbol")
//	public void step3() {
//		System.out.println("I click on + symbol");
//	}
//	@And("I enter the third number")
//	public void step4() {
//		System.out.println("I enter the third number");
//	}
//	@Then("I must be able to view the sum of numbers")
//	public void step5() {
//		System.out.println("I must be able to view the sum of numbers");
//	}
//	@Given("I am in registration form")
//	public void given_test() {
//		System.out.println("I am in registration form");
//	
//	}
//	@When("I enter my first name")
//	public void given_test2() {
//		System.out.println("I enter my first name");
//	}
	
	@Given("I am in registration form")
	public void step1() {
		System.out.println("I am in registration form");
	}
	@When("I enter my first {string}")
	public void step2(String name) {
		System.out.println("I enter my first "+name);
	}
	
	
}
	