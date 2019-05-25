package com.clasSe8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class RightClicck extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		
		WebElement rightclick= driver.findElement(By.cssSelector("input#password"));
		
		Actions right= new Actions(driver);
		
		Thread.sleep(3000);
		right.contextClick(rightclick).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
