package com.clasSe10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TaskDynamicTable1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		 /*
		  
		  TC 1: Table headers and rows verification

Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table
Click on customer details
Update customers last name
Verify updated customers name is displayed in table
Close browser
		  
		  */
		
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);
		
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id,'ctl00_MainContent_')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id,'ctl00_MainContent_')]/tbody/tr/td")); 
		
		
		String expectedValue="Susan McLaren";
		
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[contains(@id,'ctl00_MainContent_')]/tbody/tr["+i+"]/td[1]")).click();
			}
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
