package com.clasSe10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

import java.util.*;


public class TaskWebTable1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 
		 TC 1: Table headers and rows verification

Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows


		 */
		String url= "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		
		List<WebElement> cols= driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        
		for (WebElement col: cols) {
			
			String colText= col.getText();
			
			System.out.println(colText);
	}
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		
		for (WebElement row: rows) {
			
			String rowText= row.getText();
			
			
			System.out.println(rowText);
			
		}
		
		
		
		// 1 way nested for loop--> Each Cell on the Table;
		System.out.println("\n-----------1 way using nested for loop--> Each Cell on the Table;-----------------");
		/*how to print value cell by cell
		 * 1. loop through all rows
		 * 2. loop through all cols
		 * 
		 * 	driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[rows]/td[cols]")).getText();
		 * */
		ArrayList<String> Rows= new ArrayList<>();
		
		for(int i=1; i<=rows.size(); i++) {
			for (int j=1; j<=cols.size(); j++) {
				
				String cellText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				Rows.add(cellText);
				//System.out.println(cellText);
			}
		}
		
		System.out.println(Rows);
		
		// 2 way--> Each Cell on the Table;
		System.out.println("\n-----------2 way--> Each Cell on the Table-----------------");
List<WebElement> cells= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		ArrayList<String> Cells= new ArrayList<>();
		
		for (WebElement cell: cells) {
			
			String cellText= cell.getText();
			
			Cells.add(cellText);
			
			System.out.println(cellText);
			
		}
		
		System.out.println(Cells);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
