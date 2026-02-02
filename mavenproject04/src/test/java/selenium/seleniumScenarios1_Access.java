package selenium;
 
import org.testng.annotations.Test;

 
import seleniumlib.selenium66;

import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class seleniumScenarios1_Access {
	
	WebDriver driver =  new ChromeDriver();
	selenium66 ssc= new selenium66();
	
	
  @Test(priority=1)
  public void f() throws InterruptedException {
	  ssc.init(driver);
	  List<String> FinalOptions = ssc.searchOptions();
	  System.out.println(FinalOptions);
  }
  @Test(priority=2)
  public void TableData() {
	  ssc.init(driver);
	  ssc. Extract_Table_Data();
  }
  @Test(priority=3)
  public void Extract_Data_Dropdown() throws InterruptedException {
	  ssc.Select_Drop_List_Data();
	  ssc.Select_Drop_List_Data();
  }
  
  @Test(priority=4)
  public void ExtractAlertMessage() throws InterruptedException {
    ssc.init(driver);
  String actAlert=ssc.Extract_HandleAlert_Message();
  System.out.println("Alert Message is: " + " " + actAlert);
  }
  @Test(priority=5)
 public void DragAndDrop() throws InterruptedException {
    ssc.init(driver);
    Actions actAlert=ssc.frames();
  System.out.println("Dragger and Dropper: " + " " + actAlert);
  
  }}

 