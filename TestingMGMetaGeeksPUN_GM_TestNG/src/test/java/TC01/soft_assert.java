package TC01;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert{
	
  @Test
  public void testMultipleValidation() {
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(2+2,8, "Method check failed");
	  softAssert.assertEquals(10<5, "Condition check failed");
	  //softAssert.assertAll();
	  System.out.println("hello");
	  
	  
	  
  }
}
