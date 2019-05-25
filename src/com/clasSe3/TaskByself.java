package com.clasSe3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskByself {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
//		driver.findElement(By.xpath("//td[@class='mouseOut' ]")).click();
//	    driver.findElement(By.xpath("//a[@href='mercuryregister.php' ]")).click();
//		driver.findElement(By.name("firstName")).sendKeys("John");
//		driver.findElement(By.name("lastName")).sendKeys("Dolton");
//		driver.findElement(By.name("phone")).sendKeys("9112342345");
//		driver.findElement(By.id("userName")).sendKeys("djohn1234@gmail.com");
//		driver.findElement(By.name("address1")).sendKeys("123 main street");
//		driver.findElement(By.name("city")).sendKeys("Ashburn");
//		driver.findElement(By.name("state")).sendKeys("VA");
//		driver.findElement(By.name("postalCode")).sendKeys("33365");
//		driver.findElement(By.xpath("//option[@value='215']")).click();
//		driver.findElement(By.id("email")).sendKeys("djohn1234@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("1234");
//		driver.findElement(By.name("confirmPassword")).sendKeys("1234");
//		driver.findElement(By.name("register")).click();
//      driver.findElement(By.xpath("//a[@href='mercurysignon.php'  ]")).click();
		
		
		//Thread.sleep(2000);
		//driver.close();
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("djohn1234@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='2']")).click();
		driver.findElement(By.xpath("//select[@name='fromPort']/option[@value='London']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='fromMonth']/option[@value='6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='fromDay']/option[@value='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='toPort']/option[@value='New York']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='toMonth']/option[@value='6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='toDay']/option[@value='27']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='airline']/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Dolton");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Marry");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Dolton");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='pass.0.meal']/option[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='pass.1.meal']/option[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='AX']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1233445676667657");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Dolton");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']/option[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']/option[10]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='mercurywelcome.php']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
