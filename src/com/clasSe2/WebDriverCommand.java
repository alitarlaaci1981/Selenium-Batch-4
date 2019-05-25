package com.clasSe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
	driver.get("http://google.com");
	
	
	System.out.println(driver.getTitle());
	
	String title= driver.getTitle();
	
	if(title.equalsIgnoreCase("google")) {
		
		System.out.println("this is the right title");
	}
	else {
		
		System.out.println("sorry this is wrong title");
		
	}
	
	driver.get("http://facebook.com");
	
	System.out.println(driver.getTitle());
	
	String Title= driver.getTitle();
	
	
	
if(Title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
		
		System.out.println("this is the right title");
	}
	else {
		
		System.out.println("sorry this is wrong title");
		
	}


}
}
