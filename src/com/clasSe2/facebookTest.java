package com.clasSe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        
driver.get("https://mobile.twitter.com/login");
		
		Thread.sleep(2000);
		
	driver.findElement(By.name("session[username_or_email]")).sendKeys("yunus_kazan_81@hotmail.com");
		Thread.sleep(2000);
	driver.findElement(By.name("session[password]")).sendKeys("yunus81.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@data-testid,'LoginForm_Login_Button')]")).click();
		//driver.close();
        
	}

}
