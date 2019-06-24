package com.clasSe11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class advanceXpath extends CommonMethods {

	public static void main(String[] args) {
		
		/*
		 
		 Advance xpath 

//span[text()=‘username’]/.. —-> it goes from child to parent
//div[@class=‘gender’]/input —-> it goes from parent to child


//span[text=‘username’]/preceding-sibling :: input —> from next sibling to previous sibling
Or
//span[text=‘username’]/../input —> differently go parent and come back to other sibling.



//span[text=‘username’]/following-sibling :: input —> from previous sibling to next sibling 
 Or
//span[text=‘username’]/..input —> differently go parent and come back to other sibling.
		 
		 */
		
		

		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
		
		WebElement element= driver.findElement(By.xpath("//span[text()='Username']/../input")); // or we can do --> //span[text()='Username']/preceding-sibling::input
		String value= "Admin";
		sendText(element, value);
		
		element= driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")); // or we can do --> //span[text()='Username']/../input
		value= "admin123";
		sendText(element, value);
		
		element= driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
		element.click();
		
	}

}
