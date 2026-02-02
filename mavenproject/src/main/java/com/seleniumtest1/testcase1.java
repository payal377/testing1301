package com.seleniumtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.awesomeqa.com/ui");
		
		String PgTitle1= driver.getTitle();
		System.out.print(PgTitle1);
	}

}
