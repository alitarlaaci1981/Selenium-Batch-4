package com.clasSe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRegistorationPage {

	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("bob");
         Thread.sleep(2000);
        driver.findElement(By.name("customer.lastName")).sendKeys("tom");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Asel town");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("Va"); 
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("arif1");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.password")).sendKeys("arif10");
         Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("arif10");
         Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        
        driver.get("https://parabank.parasoft.com/parabank/about.htm;jsessionid=C677F5000FA43AE2CEC158C5843313A2");
        
        driver.findElement(By.name("username")).sendKeys("arif1");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("arif10");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='button']")).click();
        
        
    }

}
