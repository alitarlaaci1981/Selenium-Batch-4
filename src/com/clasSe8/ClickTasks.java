package com.clasSe8;

import java.awt.event.ActionEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class ClickTasks extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		
		Task One
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click on the click me !
Handle the alert and click okay
Double Click Double Click Me !
Handle the alert and click okay
Close the browser
		
		 */
		
	//	Task 1;
		
setUpDriver("chrome", "http://demo.guru99.com/test/simple_context_menu.html");
	
WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));

Actions action= new Actions(driver);

Thread.sleep(2000);

action.contextClick(element).perform();

Thread.sleep(1000);

driver.findElement(By.xpath("//span[text()='Copy']")).click();

Alert alert= driver.switchTo().alert();

Thread.sleep(2000);

alert.accept();


// task 2;

WebElement  element1= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

Actions act= new Actions(driver);

Thread.sleep(2000);
act.doubleClick(element1).perform();

Thread.sleep(2000);
Alert action1= driver.switchTo().alert();

Thread.sleep(2000);

action1.accept();

Thread.sleep(3000);

driver.quit();



		
	}

}
