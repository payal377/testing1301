package test2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step23 {
	@Given("I want to write a step with {string}")
	public void step1(String name) {
		System.out.println("I want to write a step with "+name);
	}
	@When("I check for the {string}")
	public void step2(String num) {
		System.out.println("I check for the "+num);
	}
	
}
