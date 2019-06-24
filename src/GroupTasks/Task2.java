package GroupTasks;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		/*
		  TC 1: Table headers and rows verification
1. Open chrome browser
2. Go to “https://jqueryui.com/”
3. Click on “Datepicker”
4. Select August 10 of 2019
5. Verify date “08/10/2019” has been entered succesfully
6. Close browser
		 */
		
		String url="https://jqueryui.com/";
		setUpDriver("chrome", url);
		
		WebElement datelink= driver.findElement(By.xpath("//a[text()='Datepicker']"));
		
		datelink.click();
		
		WebElement frame= driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(frame);
		
	WebElement datebox=	driver.findElement(By.cssSelector("input#datepicker"));
	
	datebox.click();
	
	String date= "10";
	String verifyDate= "08/10/2019";
	String monthyear= "August 2019";
	String monthtext= null;
	
	
	
	
	do {
		
		WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));
		
		next.click();
		
		Thread.sleep(1000);
		
		monthtext= driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

	} while(!(monthyear.equals(monthtext)));	
		
	Thread.sleep(3000);
	
	List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	for(WebElement cell: cells) {
		
		String EachText= cell.getText();
		
		if(EachText.contains(date)) {
			cell.click();
			break;
		}
	}
	
	String ActualDate= driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
	
	if(verifyDate.equalsIgnoreCase(ActualDate)) {
		
		System.out.println(ActualDate+" has been entered succesfully");
	}
	else {
		System.out.println(ActualDate+" has NOT been verified succesfully");
		
	}
	
	Thread.sleep(5000);
	
	driver.quit();

		
	}
}
