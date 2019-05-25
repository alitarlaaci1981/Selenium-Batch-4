package com.clasSe5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskForWebElementCommand {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 
		 TC 1: Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon
---------------------------------------------------------------------------
TC 2: Swag Labs Negative login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter invalid username and password and click login
Verify error message contains: “Username and password do not match any user in this service”
		 
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.saucedemo.com/");
		
		 String username="standard_user";
		 String password= "secret_sauce";
		 
		 // Task 1;
		 
		 WebElement usernameTxt= driver.findElement(By.cssSelector("input[id='user-name']"));
		 
		usernameTxt.sendKeys(username);
		
		WebElement passwordTxt= driver.findElement(By.cssSelector("input[id='password']"));
		 
		passwordTxt.sendKeys(password);
		
		WebElement login= driver.findElement(By.cssSelector("input[value='LOGIN']")); //div[class='peek']
		 
		  login.submit();
		  
		  WebElement product= driver.findElement(By.xpath("//div[text()='Products']"));
		String productT= product.getText();
		String ProductsText= "Products";
		  
		  
		  boolean Displayed = driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed();
		  boolean robot = driver.findElement(By.cssSelector("div.peek")).isDisplayed();

		  
		  if (Displayed && robot) {
				System.out.println("products and robot is displayed. Test is PASS");
			} else {
				System.out.println("products and robot is NOT displayed. Test is FAIL");
		}
		  
		  if (Displayed && productT.equals(ProductsText)) {System.out.println("products and robot is displayed. Test is PASS");
	} else {
		System.out.println("products and robot is NOT displayed. Test is FAIL");
}
		
		  Thread.sleep(3000);
		  
		driver.quit();  
		  
	}
}
