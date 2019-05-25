package com.clasSe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskForTestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 	TC 1: Amazon Page Title Verification:
			Open chrome browser
			Go to “https://www.amazon.com/”
			Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		 
		 */
		
		System.setProperty("webdriver.chrome.driver","/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
	driver.get("http://amazon.com");
	
	System.out.println(driver.getTitle());
		
	}

}
