package com.clasSe6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class TaskForAlert {

	public static void main(String[] args) throws InterruptedException {
		/*
		 TC 1: JavaScript alert text verification
Open chrome browser
Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
Verify
alert box with text “I am an alert box!” is present
confirm box with text “Press a button!” is present
prompt box with text “Please enter your name” is present
Quit browser
		 
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		Thread.sleep(3000);
		  // button[onclick*='myConfirmFunction()']
		
		// Alert button;
		
		driver.findElement(By.cssSelector("button[onclick*='myAlertFunction()']")).click();
		String text= "I am an alert box!";
		Thread.sleep(3000);
	    Alert alert1= driver.switchTo().alert();
	      
	    String alertText=  alert1.getText();
	      
	    if(alertText.equals(text)) {
	    
	    	System.out.println(alert1.getText()+" Text is available.");
	    	Thread.sleep(3000);
	    	alert1.accept();
	    }
	    
//	   WebElement element= driver.findElement(By.cssSelector("button[onclick*='myConfirmFunction()']"));
//	   
//	   CommonMethods.ConfirmPopupsFunction(driver, element, "I am an alert box!");
//	    
	    // Confirm Alert Button;
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button[onclick*='myConfirmFunction()']")).click();
		
		
	    String text2= "Press a button!";
	    Thread.sleep(3000);
	    Alert confirmAlert= driver.switchTo().alert();
	      
	    String confirmText=  confirmAlert.getText();
	      
	    if(confirmText.equals(text2)) {
	    
	    	System.out.println(confirmAlert.getText()+" Text is available."); // button[onclick*='myPromptFunction()']
	    	Thread.sleep(3000);
	    	confirmAlert.accept();
	    }
		
		//Prompt Alert button;
	    Thread.sleep(3000);
         driver.findElement(By.cssSelector("button[onclick*='myPromptFunction()']")).click();
		
		
	    String text3= "Please enter your name";
	    Thread.sleep(3000);
	    Alert promptAlert= driver.switchTo().alert();
	      
	    String promptText= promptAlert.getText();
	      
	    if(promptText.equals(text3)) {
	    
	    	System.out.println(promptAlert.getText()+" Text is available."); // button[onclick*='myPromptFunction()']
	    	
	    	promptAlert.sendKeys("Yunus Kazan");
	    	Thread.sleep(3000);
	    	promptAlert.accept();
	    }
	    
	    
	    Thread.sleep(3000);
		driver.quit();
	}

}
