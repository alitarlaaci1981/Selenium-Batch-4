package com.clasSe4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
