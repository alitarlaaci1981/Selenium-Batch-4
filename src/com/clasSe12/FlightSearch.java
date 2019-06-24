package com.clasSe12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class FlightSearch extends CommonMethods {
String url= "https://www.aa.com/homePage.do";
String browser= "chrome";
	
	@BeforeClass
	public void setup() {
		
		setUpDriver(browser, url);

	}
	
	
	@Test
	public static void search() throws InterruptedException {
		
		//enter to and from
				sendText(driver.findElement(By.name("originAirport")), "DCA");
				sendText(driver.findElement(By.name("destinationAirport")), "JFK");
				//click on calendar icon
				driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
				//grab element that holds month & year
				WebElement depMonth=driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
			
				while(!depMonth.getText().contains("October")) {
					driver.findElement(By.xpath("//a[@title='Next']")).click();
					//if we wont perform this action we will get
					//StaleElementReferenceException: stale element reference: element is not attached to the page document
					depMonth=driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
				}
				//capturing all cell and then loop and search for specific date
				List <WebElement> depCells=driver.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
				for(WebElement cell: depCells) {
					if(cell.getText().equals("18")) {
						cell.click();
						break;
					}
				}
			//select arrival as December 24
				//Thread.sleep(2000);
		
//		WebElement element= driver.findElement(By.xpath("//input[@name='destinationAirport']"));
//		String value= "JFK";
//		sendText(element, value);
		
	WebElement element=	driver.findElement(By.xpath("//input[@id='aa-returningFrom']/../button"));
	element.click();
	
	String text=null;
		do {
			
			element= driver.findElement(By.xpath("//a[@title='Next']"));
			element.click();
			WebElement element2=driver.findElement(By.xpath("//span[text()='December']/.."));
			text=element2.getText();
			
		}while(!text.contains("December"));
		
		
		
		List<WebElement> cells= driver.findElements(By.xpath("//div[contains(@class,'group-last')]/table/tbody/tr/td"));
		String day= "28";
		
		for(WebElement cell: cells) {
			
			String cellText= cell.getText();
			
			if(cellText.equals(day)) {
				cell.click();
				break;
			}
			
		}
		
		element= driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
		
		element.click();
		
		element= driver.findElement(By.cssSelector(("h1#aa-pageTitle")));
		
	String searchResult="Choose flights";
	
	Assert.assertEquals(element.getText(), searchResult);
	
	System.out.println(searchResult+" is Displayed succesfully. Test Passed");
		
	}
	
	
	@AfterClass
	
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	}

}
