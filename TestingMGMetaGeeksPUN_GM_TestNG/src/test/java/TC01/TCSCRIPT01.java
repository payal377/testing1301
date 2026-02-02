package TC01;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TCSCRIPT01 {
  @Test(dataProvider = "dp")
  public void f(Integer EmpId, String EmpNm, Integer EmpAge) {
	  System.out.println("Emp id id" + " " + EmpId );
	  System.out.println("Emp id name" + " " + EmpId );
	  System.out.println("Emp id age" + " " + EmpId );
	  
  }

  @Test
  (dataProvider= "dp1")
  public void f1(Integer EmpId1, String EmpNm1, Integer EmpAge1) {
	  System.out.println("Emp id id" + " " + EmpId1 );
	  System.out.println("Emp Emp name" + " " + EmpId1 );
	  System.out.println("Emp age of emp" + " " + EmpId1);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1234, "anuj",45 },
      new Object[] { 2345, "riya",52 },
      new Object[] { 3456, "hola",6 },
      new Object[] { 4567, "amigo",2},
      
    };
  }

  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { 4321, "ARYAN",45 },
      new Object[] { 5432, "LOVIE",52 },
      new Object[] { 6543, "ANNYEONG",6 },
      new Object[] { 7654, "KARAN",2},
    };
  }}

