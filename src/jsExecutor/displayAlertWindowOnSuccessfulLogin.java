package jsExecutor;



	import org.openqa.selenium.By;		
	import org.openqa.selenium.JavascriptExecutor;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.WebElement;		
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;		
	    		
	public class displayAlertWindowOnSuccessfulLogin extends CommonMethods {		

/*
 
 In this scenario, we will use "Guru99" demo site to illustrate JavaScriptExecutor. In this example,

Launch the web browser
open the site "http://demo.guru99.com/V4/ "
and login with credentials
Execute JavaScript based code using Selenium Webdriver

Display alert window on successful login.
 
 
 */
	    @Test		
	    public void Login() 					
	    {		
	    	setUpDriver("chrome", "http://demo.guru99.com/V4/");			
	        		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        //driver.get("http://demo.guru99.com/V4/");			
	        		
	        WebElement button =driver.findElement(By.name("btnLogin"));			
	        		
	        //Login to Guru99 		
	        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
	        driver.findElement(By.name("password")).sendKeys("amUpenu");					
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0].click();", button);
	                                
	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	        js.executeScript("alert('Welcome to Guru99');");   
	    		
	    }
	    
	    @AfterMethod

	    public void driverQuit() {
	    	
	    	driver.close();
	    	
	    }

	    
	}
