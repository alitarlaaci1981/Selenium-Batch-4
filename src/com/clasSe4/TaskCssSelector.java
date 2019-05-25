package com.clasSe4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href*='mercuryregister']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='pa']")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='con']")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='reg']")).click();
		
		driver.close();
		

	}
}
