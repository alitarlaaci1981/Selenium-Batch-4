package com.clasSe5;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskHowManyLinksInAmazon {
	
	
public static void main(String[] args) {
	
	/*
	 TC 1: Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Using Iterator get text of each link
Get number of links that has text
	 */
	
	System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().fullscreen();
	
	driver.get("https://www.amazon.com/");
	
	List<WebElement>  linkList= driver.findElements(By.tagName("a"));
	
	Iterator<WebElement> it= linkList.iterator();
	
	
	String linkText = null;
	int count = 0;
	
		while(it.hasNext()) {
			
			WebElement links= it.next();
			
			linkText= links.getText();
			
			if(!(linkText.isEmpty())) {
				System.out.println(linkText);
				count++;	
			}
			
			}
		
		System.out.println("\nTotal links number is "+linkList.size());
		System.out.println("\nThe total number links with text is "+count);
		driver.quit();
	
}
}
