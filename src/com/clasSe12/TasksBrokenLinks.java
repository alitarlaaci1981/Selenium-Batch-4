package com.clasSe12;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.clasSe3.linkTest;

import utils.CommonMethods;

public class TasksBrokenLinks extends CommonMethods{

	@BeforeMethod
	public static void setup() {
		
		String  url= "https://www.aa.com/homePage.do";
		
		setUpDriver("chrome", url);
		
	}
	
	@Test
	
	public static void aaBrokeLinks() {
		
		ArrayList<String> NoTextNoWork= new ArrayList<>();
		ArrayList<String> NoTextButWorking= new ArrayList<>();
		ArrayList<String> LinkNotWorking= new ArrayList<>();
		ArrayList<String> LinkWorking= new ArrayList<>();
		
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement each:links) {
			
			String linkUrl= each.getAttribute("href");
			
			try {
				URL url = new URL(linkUrl);
				
				HttpURLConnection connection= (HttpURLConnection)url.openConnection();
				
				int code= connection.getResponseCode();
				
				if(code==200 && !each.getText().isEmpty()) {
					LinkWorking.add(linkUrl);
					System.out.println(each.getText()+" is working");
				}
				else if(code==200 && each.getText().isEmpty()) {
					NoTextButWorking.add(linkUrl);
					
				}
				else if(code!=200 && !each.getText().isEmpty()) {
					LinkNotWorking.add(linkUrl);
					
					
				}
				else if (code!=200 && each.getText().isEmpty()){
					NoTextNoWork.add(linkUrl);	
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
		
		
		System.out.println(LinkNotWorking);
		System.out.println(NoTextNoWork);
		System.out.println(NoTextButWorking);
		
		
		System.out.println("Link is NOT working "+ LinkNotWorking.size());
		System.out.println("There is NO linkText and also the link is NOT working= " + NoTextNoWork.size());
		System.out.println("link is working but There is NO link text= " +NoTextButWorking.size());
		System.out.println("The number of working links= "+ LinkWorking.size());
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
