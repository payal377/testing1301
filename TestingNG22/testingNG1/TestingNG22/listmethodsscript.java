package testingNG1.TestingNG22;

import org.testng.annotations.Test;

import listmethods.listmethods;

public class listmethodsscript {
	listmethods obj = new Listmethods();
	
	boolean exp = true;
  @Test
  public void f() {
	  List <string> test1 = Array.asList("pune" "bock" "cuy");
//	  List <string> test2 = Array.asList("p1" "b2" "c3");
	  boolean res= obj.ArrayListTest(test1);
	  
	  System.out.println(res);
	  
	  Assert.assertEquals(res, exp);
	  
  }
  
  @Test
  
  public void function2() {
	  List<Integer> arr1 = Array.asList(12,13,14,15,16);
	  
	  Object act[]=obj.ConvertListTOArray(arr1);
	  
	  Assert.assertEquals(act,expArr);
  }
  
}
