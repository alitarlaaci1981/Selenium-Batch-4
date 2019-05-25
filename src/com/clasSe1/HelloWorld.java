package com.clasSe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HelloWorld {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
	driver.get("http://www.toolsqa.com/");
		
	}
}
