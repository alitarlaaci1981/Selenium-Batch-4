package com.clasSe3;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.toolsqa.com/automation-practice-form/");
		//driver.findElement(By.xpath("html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[8]/input[@name='firstname']")).sendKeys("name");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		driver.close();
		
		
//		Map map = new HashMap();
//		map.put("one",1);
//		map.put("two",5);
//		map.put("three",4);
//		map.put("four",3);
//		map.put("one",2);
//		
//		Iterator it = map.entrySet().iterator();
//		
//		while (it.hasNext() ) 
//		{
//		System.out.print( it.next() + " " );
//		}
	}

}
