package selenium.cura.curapage01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cura_page2 {
	WebDriver driver;
	FileReader fr;
	Properties p=new Properties();
	 //Locators
	
	By unm = By.name("Username");
	public void init_cura_page2(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Enter_Name_Login() throws IOException {
		String path1 ="C://Users//payal.rawat//eclipse-workspace//curapage01//testdata";
		FileReader fr = new FileReader(path1);
		p.load(fr);
		System.out.println("value of p is: " + " " + p);
		driver.findElement(unm).sendKeys(p.getProperty("username1"));
		System.out.println(p.getProperty("username1"));
		System.out.println(p.getProperty("password1"));    
	

	}
}
