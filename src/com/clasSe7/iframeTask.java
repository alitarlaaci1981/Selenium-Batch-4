package com.clasSe7;

import org.openqa.selenium.By;

import utils.CommonMethods;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class iframeTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Open chrome browser
Go to “https://www.toolsqa.com/iframe-practice-page/”
Click on “ Guest Blogs” link inside first frame
Verify element “Interactions” is present in second frame
Navigate to Home Page
Quit browser

		 */
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(3000); 
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(inter) {
			driver.switchTo().defaultContent();
			Thread.sleep(5000); 
			// driver.close();
		}
		
		/*
		
		Frame to inside frame(Nested frames), we can switchTo each other directly, but if they side to side frames, 
		
		we have to switch.default-content first and then switchTo other frame

		Window we can switchTo each other directly.

		 */

	}


}
