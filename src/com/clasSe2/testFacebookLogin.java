package com.clasSe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
	driver.findElement(By.id("email")).sendKeys("yunus_kazan_81@hotmail.com");
		Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("yunus81.");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
		
	}


	

}
