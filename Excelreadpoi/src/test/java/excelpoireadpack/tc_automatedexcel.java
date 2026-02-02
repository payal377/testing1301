package excelpoireadpack;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Excel.Excel011;

public class tc_automatedexcel {
	WebDriver driver= (WebDriver) new ChromeDriver();
	Excel011 obj= new Excel011();
  @Test
  public void SearchStringPass_oogle() {
	  driver.get("https://www.google.com");
	  String testdata= obj.ReadCellData(2,2);
	  driver.findElement(By.name("q")).sendKeys(testdata);
	   
	 
  }
}
