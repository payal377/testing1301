package com.Selenium.Day2Lib;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class seleniumdataprovider {
  @Test(dataProvider = "dp")
  public void f(Integer Emppassword , String Empname) {
	  System.out.println("Emp password" + " " + Emppassword );
	  System.out.println("Emp name" + " " + Empname );
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1345, "aryan" },
      new Object[] { 2345, "naman" },
      new Object[] { 3543, "hamid" },
    };
  }
}

