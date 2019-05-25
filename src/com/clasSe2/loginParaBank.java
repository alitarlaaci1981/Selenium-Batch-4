package com.clasSe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginParaBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        
 driver.get("https://parabank.parasoft.com/parabank/about.htm;jsessionid=C677F5000FA43AE2CEC158C5843313A2");
        
        driver.findElement(By.name("username")).sendKeys("arif1");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("arif10");
        Thread.sleep(2000);
//        driver.findElement(By.className("button")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='button']")).click();

	}

}
