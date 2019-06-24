package homeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class HomeWorkAboutWindowOnMay21 extends CommonMethods {

	
	Properties prop;
	
	
	@BeforeClass
	public void openDriver(){
		
      String filePath= "src/configs/windowscredentials.properties";
		
		
		try {
			
			FileInputStream fis= new FileInputStream(filePath);
			prop= new Properties();
			prop.load(fis);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
			
		
	}
	
	@Test
	public void  windows () throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 
TC 1: ToolsQA Windows verification
Open chrome browserGo to “https://the-internet.herokuapp.com/”
Click on “Multiple Windows” link;
Click on “Elemental Selenium”
Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
Close second window
Click on “Click Here” link;
Verify title if newly open window is “New Window”
Close second window
Verify title of second window is “The Internet”Quit browser
NOTE: Selenium execution could be too fast, please use Thread.sleep

		 
		 */
		
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		String FirstWindowID= driver.getWindowHandle();
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		
		Set<String> windows= driver.getWindowHandles();
		
		Iterator<String>  it= windows.iterator();
		
		FirstWindowID= it.next();
		
		Thread.sleep(2000);
		
		String SecondWindowID= it.next();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(SecondWindowID);
	
		
		
		String verifyTitle= "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
		
		String actual= driver.getTitle();
		
		
		 Assert.assertEquals(actual, verifyTitle);
		 
		 System.out.println("Title which is "+verifyTitle+ ", is verified");
		
		driver.close();
		
		driver.switchTo().window(FirstWindowID);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> newwindows = driver.getWindowHandles();
		
		Iterator<String> iT= newwindows.iterator();
		
		String window1= iT.next();
	
		String window2= iT.next();
		
		driver.switchTo().window(window2);
		
		String title= "New Window";
		
		actual= driver.getTitle();
		
	  Assert.assertEquals(actual, title); 
	  
	  System.out.println("The newly opening window's title is verified succesfully");
	  
	  driver.close();
	  
	  driver.switchTo().window(window1);
	  
	  String exp= "The Internet";
	  
	  actual= driver.getTitle();
	  
	 Assert.assertEquals(actual, exp);
	 
	 String url= "https://the-internet.herokuapp.com/";
	 
	 System.out.println("The target website's title which is " + url + ",  is veirfied succesfully");
		
	}
	
	@AfterClass
	
	public void tearDown () throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
