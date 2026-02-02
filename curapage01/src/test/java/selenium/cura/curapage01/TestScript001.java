package selenium.cura.curapage01;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import selenium.cura.curapage01.cura_page1;
import selenium.cura.curapage01.cura_page2;

public class TestScript001 {
	WebDriver driver= new ChromeDriver();
	
	
	cura_page1 cpage1= new cura_page1();
	cura_page2 cpage2= new cura_page2();
	
	
  @Test
  public void InvokeApp() {
	  cpage1.cura_page1_init(driver);
	  String validateLaunch= cpage1.LaunchApp("//https://katalon-demo-cura.herokuapp.com/");
  }
  @Test(priority=2)
  public void Click_Make_Appointment() throws InterruptedException {
	   Thread.sleep(3000);
	   cpage1.Click_On_Make_An_Appointment();
  }
  @Test(priority=3)
  public void PerformLogin() throws IOException {
	   cpage2.init_cura_page2(driver);
	   cpage2.Enter_Name_Login();
  }
}
