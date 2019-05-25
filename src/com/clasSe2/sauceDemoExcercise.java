package com.clasSe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemoExcercise {

	public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
      Thread.sleep(2000);
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      Thread.sleep(2000);
      driver.findElement(By.className("btn_action")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@class='btn_primary btn_inventory']//descendant::button[1]")).click();
      Thread.sleep(2000);
      
     // driver.get("https://www.saucedemo.com/inventory.html");
     // driver.findElement(By.cssSelector("button.btn_primary btn_inventory")).click();
      //driver.close();
 
    }
}
