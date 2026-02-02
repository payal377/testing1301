 package com.seleniumtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Awesometc {
	WebDriver driver=new ChromeDriver();
	seleniumday1 pg1 = new seleniumday1();
	seleniumday1 pg0 = new seleniumday1();
    
	
	
  @Test (priority=1)
  public void InvokeApp_Awesome() {
     pg1.init(driver);
     pg1.InvokeAwesomeQaApp();
}
  @Test (priority=2)
  public void Fetch_And_Validate_Test(String Exp_HomePgTitleIs) {
	  String HomePgTitleIs = pg1.Awesomehome_PageTitle();
	  System.out.println("HomePgTitleIS" + " "+ HomePgTitleIs);
	  Assert.assertEquals(HomePgTitleIs, Exp_HomePgTitleIs);
  }
  @Test (priority=3)
  
  public void Count_Links_test() throws InterruptedException {
	  int cnt=pg1.Count_links_From_HomePage();
	  System.out.println("Total number of links : " + " " + cnt);
  }}