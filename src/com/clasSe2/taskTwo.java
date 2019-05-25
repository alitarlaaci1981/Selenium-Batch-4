package com.clasSe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskTwo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String getTilte = driver.getTitle();
		System.out.println(getTilte);
		if (getTilte.contains("Syntax")) {
			System.out.println("title does contain syntax");
		} else {
			System.out.println("title does not contain syntax");
		}
	}
}
