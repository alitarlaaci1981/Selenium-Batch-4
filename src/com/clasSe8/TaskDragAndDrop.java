package com.clasSe8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Command;

import utils.CommonMethods;

public class TaskDragAndDrop extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://demo.guru99.com/test/drag_drop.html");
		
		WebElement element1= driver.findElement(By.xpath("//a[text()=' 5000 ']")); // 5000
		WebElement element2= driver.findElement(By.xpath("//a[text()=' BANK ']")); // Bank
		WebElement element3= driver.findElement(By.xpath("//a[text()=' SALES ']"));  // Sale
		WebElement element4= driver.findElement(By.xpath("//a[text()=' -5000 ']"));   // -5000
		
		WebElement drop1= driver.findElement(By.cssSelector("ol#bank")); // debit account
		WebElement drop2= driver.findElement(By.cssSelector("ol#amt7")); // debit amount
		WebElement drop3= driver.findElement(By.cssSelector("ol#loan")); // crdit account
		WebElement drop4= driver.findElement(By.cssSelector("ol#amt8")); // credit amount
		
		
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(element1, drop2).perform();
		Thread.sleep(2000);
		action.dragAndDrop(element2, drop1).perform();
		Thread.sleep(2000);
		action.dragAndDrop(element3, drop3).perform();
		Thread.sleep(2000);
		action.dragAndDrop(element4, drop4).perform();
		Thread.sleep(2000);
		action.dragAndDrop(element1, drop4).perform();
		Thread.sleep(2000);
		
		
//		action.clickAndHold(element1).moveToElement(drop2).release(element1).perform();
//		Thread.sleep(3000);
//		action.clickAndHold(element2).moveToElement(drop1).release(element2).perform();
//		Thread.sleep(3000);
//		action.clickAndHold(element3).moveToElement(drop3).release(element3).perform();
//		Thread.sleep(3000);
//		action.clickAndHold(element4).moveToElement(drop4).release(element4).perform();
//		Thread.sleep(3000);
//		action.clickAndHold(element1).moveToElement(drop4).release(element4).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
