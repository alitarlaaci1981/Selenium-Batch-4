package com.clasSe9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class task1 extends CommonMethods{

	public static void main(String[] args) {
		/*
		
		TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser
		
		 */
		
		String url= "https://the-internet.herokuapp.com";
		
		setUpDriver("chrome", url);
		
		WebElement elem= driver.findElement(By.linkText("Dynamic Loading"));
		
		elem.click();
		
		WebElement elem2= driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
		
		elem2.click();
		
	WebElement elem3=	driver.findElement(By.xpath("//button[text()='Start']"));
	
	elem3.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		 
		 WebElement elem4= driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		
		 String text=elem4.getText();
		 
		 if (elem4.isDisplayed()) {
				
			 System.out.println("Element text with '"+text+"' is displayed");
			 
			}else {
				System.out.println("Element with text '"+text+"' is not displayed");
			}
			
			driver.quit();
	}

}
