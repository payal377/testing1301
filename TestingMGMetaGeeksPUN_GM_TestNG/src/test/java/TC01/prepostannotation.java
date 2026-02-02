package TC01;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class prepostannotation {
  @BeforeTest
  public void BeforeTestExecute() {
	  System.out.println("This will execute before the Test");
  }
  
  
  @AfterTest 
     public void AFterTestExecute() {
    	 System.out.println("This will execute before the Test");
     }
  
  @BeforeClass
     public void BeforeTestClass() {
 	     System.out.println("Before class");
  }
  
  @AfterClass
  public void AfterTestClass() {
	     System.out.println("After class");
}
  @BeforeMethod
  public void BeforeMethodTest() {
	     System.out.println("Before Method");

  }
  
  @AfterMethod
  public void AfterMethodTest() {
	     System.out.println("After Method");

  }
}