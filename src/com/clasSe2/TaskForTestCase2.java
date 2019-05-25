package com.clasSe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskForTestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 	TC 2: Syntax Page URL Verification:
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”
		 */
		
		System.setProperty("webdriver.chrome.driver","/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
	//driver.get("https://www.syntaxtechs.com/");
	
	driver.navigate().to("https://www.syntaxtechs.com/");
	
	driver.navigate().to("https://www.google.com/");
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	System.out.println(driver.getTitle());
	
	if(driver.getTitle().contains("Syntax")) {
		
		
		System.out.println("The Title contains 'Syntax' word");
		
	}
	
	else {
		
		System.out.println("sorry it's not there");
		
	}
	driver.close();
	
	}

}
