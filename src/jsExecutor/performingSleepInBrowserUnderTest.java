package jsExecutor;


import java.util.concurrent.TimeUnit;		

import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class performingSleepInBrowserUnderTest extends CommonMethods {

		/*
		
		In this scenario, we will use "Guru99" demo site to illustrate executeAsyncScript. In this example, you will;
Launch the browser.
Open site "http://demo.guru99.com/V4/ ".
Application waits for 5 sec to perform a further action.
Step 1) Capture the start time before waiting for 5 seconds ( 5000 milliseconds) by using executeAsyncScript() method.

Step 2) Then, use executeAsyncScript() to wait 5 seconds.

Step 3) Then, get the current time.

Step 4) Subtract (current time – start time) = passed time.

Step 5) Verify the output it should display more than 5000 milliseconds
		
		 */				

		    @Test		
		    public void Login() 					
		    {		
		        		
		    	setUpDriver("chrome", "http://demo.guru99.com/V4/");			

		        //Creating the JavascriptExecutor interface object by Type casting		
		        JavascriptExecutor js = (JavascriptExecutor)driver;		
		        		
		        //Launching the Site.		
		        //driver.get("http://demo.guru99.com/V4/");			
		     
		          //Maximize window		
		          driver.manage().window().maximize();		
		        		
		          //Set the Script Timeout to 20 seconds		
		          driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);			
		             
		          //Declare and set the start time		
		          long start_time = System.currentTimeMillis();			
		                   
		          //Call executeAsyncScript() method to wait for 5 seconds		
		          js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");			
		          		
		         //Get the difference (currentTime - startTime)  of times.		
		         System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));					
		                    		
	}
		    
		    @AfterMethod

		    public void driverQuit() {
		    	
		    	driver.close();
		    	
		    }

}
