package com.clasSe5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeworkFace {

	public static void main(String[] args) throws InterruptedException {
		
		// Task 2;
		
					System.out.println("-------------Task 2 start---------------");
					
					System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
					
					WebDriver driver= new ChromeDriver();
					driver.manage().window().fullscreen();		
					
					driver.get("https://www.facebook.com/");
					
					
					//months
					
					List<String> monthList= new LinkedList<String>();
					
					WebElement selectmonth= driver.findElement(By.cssSelector("select#month"));
					
					Select obj= new Select(selectmonth);
					
					List<WebElement> months= obj.getOptions();
					
					String mymonth= "Jun";
					
					for(WebElement monthlist:months) {
						
						monthlist.getText();
						
						monthList.add(monthlist.getText());
					}
					
					if(monthList.contains(mymonth)) {
						Thread.sleep(3000);
						obj.selectByVisibleText("Jun");
					}
					
					System.out.println("Month (mm) has "+ months.size() +" month options");
					
					System.out.println(monthList); 
					
					//days
					
					List<String> dayList= new LinkedList<String>();
					
					WebElement selectday= driver.findElement(By.cssSelector("select#day"));
					
					Select objday= new Select(selectday);
					
					List<WebElement> days= objday.getOptions();
					
					String myday= "26";
					
					for(WebElement daylist:days) {
						
						 daylist.getText();
						
						dayList.add(daylist.getText());
					}
					
					if(dayList.contains(myday)) {
						Thread.sleep(3000); 
						objday.selectByVisibleText("26");
					}
					
					System.out.println("Day (dd) has "+ days.size() +" day options");
					System.out.println(dayList);
					
					
					// years
					
					List<String> yearList= new LinkedList<String>();
					
					WebElement selectyear= driver.findElement(By.cssSelector("select#year"));
					
					Select objyear= new Select(selectyear);
					
					List<WebElement> yearss= objyear.getOptions();
					
					String myyear= "1987";
					
					for(WebElement yearlist:yearss) {
						
						 yearlist.getText();
						
						yearList.add(yearlist.getText());
					}
					
					if(yearList.contains(myyear)) {
						Thread.sleep(3000);
						objyear.selectByVisibleText("1987");
					}
					
					System.out.println("Year (yyyy) has "+ yearss.size() +" year options");
					System.out.println(yearList);

					Thread.sleep(3000);
					driver.quit();

	}

}
