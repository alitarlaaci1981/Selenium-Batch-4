package com.clasSe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
	driver.navigate().to("http://walmart.com");
	
	Thread.sleep(3000);
	
	driver.navigate().to("http://google.com");
	
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	Thread.sleep(3000);
	
	driver.navigate().forward();
	
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	
	Thread.sleep(3000);
	
	driver.close();
		
	}

}
