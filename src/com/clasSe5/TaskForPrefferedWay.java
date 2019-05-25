package com.clasSe5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskForPrefferedWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 
Check all Years of Experience radio buttons are clickable
* -----------------------------------------------
* Check all Automation Tools checkboxes are clickable
* and keep “Selenium WebDriver” option as selected
		 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		
		List<WebElement> years= driver.findElements(By.name("exp"));
		
		String Valueis= "1";
		
		for(WebElement yearsButton: years) {
			
			
			if(yearsButton.isEnabled()) {
				
				String value= yearsButton.getAttribute("value");
				System.out.println(value);
				
				if(Valueis.equals(value)) {
					
					yearsButton.click();
					
				}
			}
		}
		
		
	}

}
