package com.clasSe11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class TaskbyInstructor extends CommonMethods{
	
	static String expected="File uploaded!";
	
	public static void main(String[] args) {
		String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome",url);
        
		takeAscreenShot("WebTool", "Login");
		
		String filePath="/Users/Syntax/Downloads/car.jpg";
		driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
		
		takeAscreenShot("WebTool", "Upload1");
		
        driver.findElement(By.cssSelector("button.gwt-Button")).click();
        
        String textActual=getAlertText();
        
        if (textActual.equals(expected)) {
        	System.out.println("File is uploaded");
        }else {
        	System.out.println("File is NOT uploaded");
        }
        
        acceptAlert();
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        File scr=ts.getScreenshotAs(OutputType.FILE);
        
        try {
			FileUtils.copyFile(scr, new File("screenshots/WebTool/Upload.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to take screesnhot");
		}
        
        driver.quit();
	}
}
