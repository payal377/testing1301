package com.seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class seleniumday1{
	WebDriver driver;
	
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	
	public void InvokeAwesomeQaApp() {
		driver.get("https://ww.awesomeqa.com/ui");
	}
	
	public String Awesomehome_PageTitle() {
		String pgTitleHome= driver.getTitle();
		return pgTitleHome;
	}
	public int Count_links_From_HomePage() throws InterruptedException {
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		int LinkCounts= Links.size();
		
		Thread.sleep(3000);
		for(int i=1; i<LinkCounts; i++) {
			String Link_name=Links.get(i).getText();
			Thread.sleep(200);
			System.out.println(Link_name);
		}
		return LinkCounts;

		
	}
}