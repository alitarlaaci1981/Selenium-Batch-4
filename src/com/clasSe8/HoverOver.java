package com.clasSe8;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class HoverOver extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		setUpDriver("chrome", "https://www.toolsqa.com");
		
		WebElement hover= driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		
		Actions action= new   Actions(driver);
		
		action.moveToElement(hover).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Automation Practice Table']")).click();
		
		Thread.sleep(30000);
		
		driver.close();
	}

}
