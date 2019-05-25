package com.clasSe3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://facebook.com/");
		
//		driver.findElement(By.name("firstname")).sendKeys("John");
//		Thread.sleep(3000);
//		driver.findElement(By.name("lastname")).sendKeys("Mckeinze");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_h")).sendKeys("swapsoftware.tech@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_k")).sendKeys("swapsoftware.tech@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_o")).sendKeys("yunkaz81.");
//		Thread.sleep(3000);
//		driver.findElement(By.id("month")).sendKeys("Jun");
//		Thread.sleep(3000);
//		driver.findElement(By.id("day")).sendKeys("26");
//		Thread.sleep(3000);
//		driver.findElement(By.id("year")).sendKeys("1987");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_a")).click(); 
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_u")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("swapsoftware.tech@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("yunkaz81.");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Link Test")).click();
		driver.findElement(By.partialLinkText("Partial")).click();
		
		driver.navigate().to("https://www.amazon.com/ap/signin?openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_em_link_re_signin%26_encoding%3DUTF8&ref_=nav_em_T1_0_1_0_6_link_clc_signin");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("swapsoftware.tech@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("yunkaz81.");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		

	}

}
