package jsExecutor;

import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;	

public class captureScrapeData extends CommonMethods {

		/*
		 
Capture Scrape Data and Navigate to different pages using JavaScriptExecutor.
Execute the below Selenium script. In this examples;
Launch the site
Fetch the details of the site like URL of the site, title name and domain name of the site.
Then navigate to a different page.	
		 		
		 */

	    @Test		
	    public void Login() 					
	    {		
	       setUpDriver("chrome", "http://demo.guru99.com/V4/");			
	        		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        //driver.get("http://demo.guru99.com/V4/");
				
	        //Fetching the Domain Name of the site. toString() change object to name.		
	        String DomainName = js.executeScript("return document.domain;").toString();			
	        System.out.println("Domain name of the site = "+DomainName);					
	          		
	        //Fetching the URL of the site. toString() change object to name		
	        String url = js.executeScript("return document.URL;").toString();			
	        System.out.println("URL of the site = "+url);					
	          		
	       //Method document.title fetch the Title name of the site. toString() change object to name		
	       String TitleName = js.executeScript("return document.title;").toString();			
	       System.out.println("Title of the page = "+TitleName);					

	        		
	      //Navigate to new Page i.e to generate access page. (launch new url)		
	      js.executeScript("window.location = 'http://demo.guru99.com/'");			
	    }		
	

@AfterMethod

public void driverQuit() {
	
	driver.close();
	
}

}