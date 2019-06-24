package com.clasSe12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import utils.CommonMethods;

public class TaskPropertiesFile extends CommonMethods{
	
	
	
	
	/*
	 TC 1: OrangeHRM Login

Navigate to “https://opensource-demo.orangehrmlive.com/”
Login to the application
Verify user is successfully logged in

Note: must use properties file

	 */
	
	Properties prop;
	
	@Test
	
	public void loginOrangeHRM() {
		
String filePath="src/configs/credentials.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		
		WebElement element= driver.findElement(By.cssSelector("input#txtUsername"));
		String value= "Admin";
		sendText(element, value);
		
		element= driver.findElement(By.cssSelector("input#txtPassword"));
		value= "admin123";
		sendText(element, value);
		
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		
		String Expected= "Dashboard";
		String actual= driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		String message="Actual value is matched with expected = "+Expected;
		
		Assert.assertEquals(actual, Expected);
		System.out.println(message);
		
		driver.quit();
		
	}
	
	
	

}
