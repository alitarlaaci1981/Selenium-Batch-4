package com.clasSe7;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class iframe extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		// 1 way by frame name or frame ID;
		
		driver.switchTo().frame("iframe_a");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("Yunus Kazan");
		
		driver.switchTo().defaultContent();
		
		// 2 way by xpath or css locator;
		
		WebElement location = driver.findElement(By.cssSelector("iframe[name='iframe_a']"));
		driver.switchTo().frame(location);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("My Email is yunus_kazan_81@hotmail.com"); 
		
		driver.switchTo().defaultContent();
		
		
		// 3 way by frame index by zero-based index;
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("I'm  living in florida");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
