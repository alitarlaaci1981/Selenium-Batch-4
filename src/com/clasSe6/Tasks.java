package com.clasSe6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tasks {

	public static void main(String[] args) throws InterruptedException {
		/*
		 
		 TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department
Select Computers
Quit browser
----------------------------------------------------
TC 2: Select and Deselect values
Open chrome browser
Go to “http://uitestpractice.com/”
Click on “Select” tab
Verify how many options available in the first drop down and then select “United states of America”
Verify how many options available in the second drop down and then select all.
Deselect China from the second drop down
Verify how many options available in the third drop down and then select all.
Quit browser
		 */

		// Task 1;
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://amazon.com/");	
		
	WebElement  all= driver.findElement(By.cssSelector("select#searchDropdownBox"));
		
	Select obj= new Select(all);
	
	String text= "Computers";
	
	     List<WebElement> alldep= obj.getOptions();
	
		for(WebElement each : alldep) {
			
			String eachdepName = each.getText();
			
			if(eachdepName.equals(text)) {
				
			obj.selectByVisibleText("Computers");
			System.out.println(eachdepName);
			
			}
			
		}
		Thread.sleep(5000);
		
		System.out.println("\nTotal number of options is "+alldep.size());
		
//		Thread.sleep(3000);
//		driver.quit();
		
		
		// Task 2;
		
		
		driver.get("http://uitestpractice.com/");
		
		driver.findElement(By.cssSelector("a[href*='Select']")).click();
		
		WebElement drop= driver.findElement(By.cssSelector("select#countriesSingle"));
		
		Select objdrop= new Select(drop);
		
		
		List<WebElement> droplist= objdrop.getOptions();
		
		System.out.println("\nfor first drop option available "+ droplist.size());
		
		objdrop.selectByVisibleText("United states of America");
		
		WebElement drop2= driver.findElement(By.cssSelector("select#countriesMultiple"));
		
		Select objdrop2= new Select(drop2);
		
		List<WebElement> droplist2= objdrop2.getOptions();
		
		System.out.println("\nfor second drop option available "+ droplist2.size());
		
		if(objdrop2.isMultiple()) {
			
		for(int i=0; i<droplist2.size(); i++) {
			Thread.sleep(1000);
			objdrop2.selectByIndex(i);
	        }	
		}
		
		objdrop2.deselectByVisibleText("China");
			
		Thread.sleep(3000);
		driver.quit();
	}

}
