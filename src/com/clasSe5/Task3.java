package com.clasSe5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
/*
 * Check all Years of Experience radio buttons are clickable 
 * -----------------------------------------------
 * Check all Automation Tools checkboxes are clickable 
 * and keep “Selenium WebDriver” option as selected
 */
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		// Task 1;
		
		
//		List<WebElement> radioExp=driver.findElements(By.xpath("//input[@name='exp']"));
//		for (WebElement radio: radioExp) {
//			if(radio.isEnabled()) {
//				radio.click();
//				Thread.sleep(2000);
//				String value= radio.getAttribute("value");
//				System.out.println(value);	
//				
//			}
//		}
		
		
		//Task 2;
		
		List<WebElement> Autotools= driver.findElements(By.cssSelector("input[name='tool']"));
		
		String AutoTool= "Selenium Webdriver";
		Map<String, String> listofTools= new HashMap<String, String>();
		
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
		
		Thread.sleep(2000);
		driver.quit();
	}
}