package com.clasSe7;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;

import utils.CommonMethods;

public class Windows extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*
		
		http://uitestpractice.com/Students/Switchto
Task
Ahead to http://uitestpractice.com/Students/Switchto
Get the parent title
Get the parentId
print the parent title and parentId
Click on the open in a new window
Get the child title
Get the childId
print the child title and childId
close the child window
		
		
		 */
		
		
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
	
		
		String ParentTitle= driver.getTitle();
		String ParentID= driver.getWindowHandle();
		
		System.out.println("Title: "+ ParentTitle+" ID: "+ParentID);
		
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click(); // text() only can get used by  xpath not css... keep in mind..
		
		Set<String> allwindows= driver.getWindowHandles();
		
		Iterator<String> it= allwindows.iterator();
		
		ParentID=it.next();
		
		String ChildID= it.next();
		
		driver.switchTo().window(ChildID);
		
		
		String 	ChildTitle= driver.getTitle();
		
		
		System.out.println("Title: "+ ParentTitle+" ID: "+ParentID);
		
		System.out.println("Title: "+ ChildTitle+" ID: "+ChildID);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
