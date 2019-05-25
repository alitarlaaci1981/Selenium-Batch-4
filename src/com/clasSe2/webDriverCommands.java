package com.clasSe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("this is the right title ");
		}
		else
		{
			System.out.println("sorry this not the title");
		}
	}

}
