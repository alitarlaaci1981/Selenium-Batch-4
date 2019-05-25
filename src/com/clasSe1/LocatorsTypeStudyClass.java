package com.clasSe1;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTypeStudyClass {

	

		public static void main(String[] args) throws InterruptedException {
			WebElement textBox;
			System.setProperty("webdriver.chrome.driver","/Users/yunuskazan/Selenium/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com");
			driver.manage().window().maximize();
			
			//Locate By Id
			//textBox=driver.findElement(By.id("gh-sb gh-sprRetina"));
			//textBox.sendKeys("Yunus");
			
			//Locate By Name
			/*textBox=driver.findElement(By.name("q"));
			textBox.sendKeys("Amarindaz");*/
			
			
			//Locate By Class Name
			//textBox=driver.findElement(By.className("gh-sb gh-sprRetina"));
			
			List<WebElement> AllCategories=driver.findElements(By.tagName("option"));
			
			for(int i=0;i<AllCategories.size();i++)
			{
				System.out.println(AllCategories.get(i).getText());}
			//textBox.sendKeys("Amarindaz");
			
			//Locate by Tag Name
			/*List<WebElement> allLinks=driver.findElements(By.tagName("a"));
			
			for(int i=0;i<allLinks.size();i++)
			{
				System.out.println(allLinks.get(i).getText());
			}*/
			
			//Link Text
			//driver.findElement(By.linkText("Choose which settings work best for you")).click();
			
			
			//Partial Link Text
			//driver.findElement(By.partialLinkText("Google"));
			
			//By CSS
			/*textBox=driver.findElement(By.cssSelector("input#lst-ib"));
			textBox.sendKeys("Amarindaz");*/
			
			//By xpath
			//textBox=driver.findElement(By.xpath("//input[@id='lst-ib']"));
			//textBox.sendKeys("Amarindaz");
			
			
			
			Thread.sleep(2000);
			driver.close();
			

		}

	}
