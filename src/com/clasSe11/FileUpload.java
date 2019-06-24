package com.clasSe11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;
import org.testng.annotations.Test;


import utils.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://the-internet.herokuapp.com";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("File Upload")).click();
		
		String filePath="/Users/yunuskazan/Yunus/myphoto.jpg";
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		
		boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File uploaded successfully");
		}
		
		
		TakesScreenshot camera= (TakesScreenshot)driver;
		
		File screen= camera.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen, new File("screenShots/TheInternet/FileUploaded.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("The file Screenshot was NOT taken");
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

	
}
