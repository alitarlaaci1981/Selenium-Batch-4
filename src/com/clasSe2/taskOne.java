package com.clasSe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		String actual = title;
		String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("valid title");
		} else {
			System.out.println("invalid title");
		}
		driver.quit();

	}

}