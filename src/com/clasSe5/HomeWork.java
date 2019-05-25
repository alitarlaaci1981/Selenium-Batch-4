package com.clasSe5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		
   HW for all of you:

TC 1: Tools QA check all elements
Open chrome browser
Go to “https://www.toolsqa.com/automation-practice-form/”
Fill out:
First Name
Last Name
Check that sex radio buttons are enabled and select “Male”
Check all Years of Experience radio buttons are clickable
Date
Select both checkboxes for profession
Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
Quit browser
-----------------------------------------------------
TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth    
Quit browser

		 */
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		
		WebElement fName= driver.findElement(By.cssSelector("input[name*='firs'] "));
		WebElement lName= driver.findElement(By.cssSelector("input[name*='last'] "));
		WebElement date= driver.findElement(By.cssSelector("input#datepicker"));
		
		if (fName.isDisplayed() & fName.isEnabled() & lName.isDisplayed() & lName.isEnabled()) {
		
			Thread.sleep(2000);
		   fName.sendKeys("YUNUS");
		   Thread.sleep(2000);
		   lName.sendKeys("KAZAN");
		
		}
		
		
		List<WebElement> radioSeBut= driver.findElements(By.cssSelector("input[name*='sex']"));
		
		//Iterator<WebElement> it = radioSeBut.iterator();// if we want to reverse and click by any condition, iterator doesnt work. we have to use for loop
		
		String sex= "Male";
		WebElement sexVal= null;
		String typeofsex= null;
		
		  // while(it.hasNext()){
			   
				//sexVal= it.next();
		
		for(int i=0; i<radioSeBut.size(); i++) {
			
			     sexVal= radioSeBut.get(i);
			
				
				typeofsex= sexVal.getAttribute("value");
				
				if(sexVal.isDisplayed() & sexVal.isEnabled()) {
				
					Thread.sleep(2000);
					sexVal.click();
				}	
			}
		   
		   if(!typeofsex.equals(sex)) {
				Thread.sleep(2000);
				radioSeBut.get(0).click();
			}
			
			
			
			List<WebElement> radioyears= driver.findElements(By.cssSelector("input[name*='xp']"));
			
			List<String> listyear= new LinkedList<String>();
			
			
			String selectedValue= "3";
			String yearValu= null;
			WebElement year = null;
			
			for(int i=0; i<radioyears.size(); i++) {
				
				    year= radioyears.get(i);
				    
				    yearValu= year.getAttribute("value");
				    
				    listyear.add(yearValu);
				
				if(year.isDisplayed() & year.isEnabled()) {
					Thread.sleep(2000);
					year.click();	
				}
				
			}

				if(listyear.contains(selectedValue)) {
					Thread.sleep(2000);
					radioyears.get(2).click();
				}
				
			
			
			
			
			date.sendKeys("06/26/1987");
			
			
			List<WebElement> professional= driver.findElements(By.cssSelector("input[name*='pro']"));
			
			String pros= "Automation Tester";
			
			for(WebElement pro: professional) {
				
				if(pro.isDisplayed()) {
					
					Thread.sleep(2000);
				    pro.click();
				}
				
				String prostype= pro.getAttribute("value");
				
				
				if(!prostype.equals(pros)) {
					Thread.sleep(2000);
					pro.click();
					
				}
			}
			
			
			List<WebElement> Autotools= driver.findElements(By.cssSelector("input[name='tool']"));
			
			
			
			Map<String, String> listofTools= new HashMap<String, String>();
			
			String AutoTool= "Selenium Webdriver";
			
			for (WebElement tools: Autotools) {
				
				//System.out.println(tools.getAttribute("value"));
				
				if(tools.isDisplayed()&& tools.isEnabled()) {
					Thread.sleep(2000);
					tools.click();
					
					String Value= tools.getAttribute("value");
					String ID= tools.getAttribute("id");
					
					listofTools.put(Value, ID);
				
					
					if(!(Value.equals(AutoTool))) {
						
						Thread.sleep(2000);
						tools.click();	
					}
					
				}
			}
			
			System.out.println(listofTools);
			

			Thread.sleep(3000);
			driver.quit();
	}

}
