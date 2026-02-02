package bdd1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookTest {
	@Before
	public void testBefore() {
		System.out.println("Before Test");
	}
	@After
	public void testAfter() {
		System.out.println("After Test");
		
	}
	@Before("@tag2")
	public void BeforewithTag() {
		System.out.println("Before with Tag");
	}
	@After("@tag2")
	public void AfterwithTag() {
		System.out.println("After with Tag");
	}
	

}
