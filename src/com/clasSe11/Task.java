package com.clasSe11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*
		 
		 TC 1: Upload file and Take Screenshot

Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot
		 
		 
		 */
		
		String url= "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome", url);
		
		String filepath= "/Users/yunuskazan/Yunus/myphoto.jpg";
		
		driver.findElement(By.cssSelector("input#gwt-debug-cwFileUpload")).sendKeys(filepath);
		driver.findElement(By.cssSelector("button.gwt-Button")).click();
		
		String alertText= getAlertText();
		
		if(alertText.equals("File uploaded!")) {
		acceptAlert();
		System.out.println("File was Uploaded successfully");
		}else {
			System.out.println("File was Not Uploaded successfully");
		}
		
		TakesScreenshot camera= (TakesScreenshot)driver;
		
		File newfile= camera.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(newfile, new File("screenShots/WebsiteSample/showcase.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Screenshot was Not taken");
		}
		
		
		System.out.println("File was uploaded and taken screenshots succesfully");

		Thread.sleep(3000);
		driver.quit();
	}

}
