package GroupTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 
		 Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11 /WebOrders/login.aspx”
2. Login to the application
3. Create an Order
4. Verify order of that person is displayed in the table “List of All
Orders”
5. Click on edit of that specific order
6. Verify each order details
7. Update street address
8. Verify in the table that street has been updated
9. Close browser
		 
		 */
		
		String url= "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		
		
		driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();  //a[text()='Order']
		
		driver.findElement(By.xpath("//a[text()='Order']")).click();
		
		
		
		WebElement alloptions=  driver.findElement(By.cssSelector("select#ctl00_MainContent_fmwOrder_ddlProduct"));
		
		Select select= new Select(alloptions);
		
		List<WebElement> dropdown= select.getOptions();
		
		Iterator<WebElement> it= dropdown.iterator();
		
		while(it.hasNext()) {
			
			String options= it.next().getText();
			
			//System.out.println(options);	
		}
		
		select.selectByVisibleText("ScreenSaver");
	
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id*='txtQuantity']")).sendKeys("4");  
		driver.findElement(By.cssSelector("input[id*='txtUnitPrice']")).sendKeys("100");
		driver.findElement(By.cssSelector("input[id*='txtDiscount']")).sendKeys("25");
		driver.findElement(By.cssSelector("input[value*='Calculate']")).click();  
		
	WebElement resetBut=driver.findElement(By.cssSelector("input[value*='Reset']"));
	
	if(resetBut.isDisplayed() & resetBut.isEnabled()) {
		
		resetBut.click();
	}
	
	
	WebElement alloption=  driver.findElement(By.cssSelector("select#ctl00_MainContent_fmwOrder_ddlProduct"));
	
	Select select1= new Select(alloption);
	
	List<WebElement> dropdown1= select1.getOptions();
	
	Iterator<WebElement> It= dropdown1.iterator();
	
	while(it.hasNext()) {
		
		String option= It.next().getText();
		
		System.out.println(option);	
	}
	
	
		select1.selectByVisibleText("MyMoney");
	
		
		driver.findElement(By.cssSelector("input[id*='txtQuantity']")).sendKeys("4");  
		driver.findElement(By.cssSelector("input[id*='txtUnitPrice']")).sendKeys("100");
		driver.findElement(By.cssSelector("input[id*='txtDiscount']")).sendKeys("25");
		driver.findElement(By.cssSelector("input[value*='Calculate']")).click();  
		
		driver.findElement(By.cssSelector("input[id*='txtName']")).sendKeys("Yunus Kazan");
		driver.findElement(By.cssSelector("input[id*='TextBox2']")).sendKeys("4830 mariners way");
		driver.findElement(By.cssSelector("input[id*='TextBox3']")).sendKeys("Coconut Creek");
		driver.findElement(By.cssSelector("input[id*='TextBox4']")).sendKeys("FL");
		driver.findElement(By.cssSelector("input[id*='TextBox5']")).sendKeys("33087");
		
	WebElement ccButton= driver.findElement(By.cssSelector("input[id*='cardList_1']"));
//	WebElement listText= driver.findElement(By.xpath("//h2[contains(@text(),'List of All Orders')]"));
//	
//	String listALl= listText.getText();
//	System.out.println(listALl);
	
	if(ccButton.isEnabled()) {
		
		ccButton.click();
	}
	
		driver.findElement(By.cssSelector("input[id*='TextBox6']")).sendKeys("2504545049453943223");
		
		driver.findElement(By.cssSelector("input[id*='TextBox1']")).sendKeys("09/2025");  //input[value*='Reset']
		
		Thread.sleep(3000);
		
		WebElement processBut= driver.findElement(By.cssSelector("a[id*='InsertButton']"));// //a[text()='View all orders']
		
		if (processBut.isDisplayed()& processBut.isEnabled()) {
			
			processBut.click();
		}
		
		
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();
		
	
		
		String name="Yunus Kazan";
		String street= "4830 mariners way";
		String city= "Coconut Creek";
		String state ="FL";
		String zipcode= "33087";
		
		
		
		List<WebElement> cells= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td"));
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
		ArrayList<String> order= new ArrayList<>();
		
		for(WebElement cell:cells) {
			
			String cellText= cell.getText();
			
			order.add(cellText);
		}
			
		
		if(order.contains(name) & order.contains(street) & order.contains(city) & order.contains(state)& order.contains(zipcode))
			
		{ 	
			driver.findElement(By.xpath("//table[contains(@id, '_orderGrid')]/tbody/tr[2]/td[1]")).click();	
			Thread.sleep(3000);
	}		
			
/*
	WebElement delete=	driver.findElement(By.cssSelector("input#ctl00_MainContent_btnDelete"));
	
	Thread.sleep(3000);
	delete.click(); 
	
	*/
		
		
	// click order details button;
	WebElement checkOrder= driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr/td[13]"));
	
	Thread.sleep(3000);
	checkOrder.click();
	
	
	// clear Address boxes;
	driver.findElement(By.cssSelector("input[id*='TextBox2']")).clear();
	driver.findElement(By.cssSelector("input[id*='TextBox3']")).clear();
	driver.findElement(By.cssSelector("input[id*='TextBox4']")).clear();
	driver.findElement(By.cssSelector("input[id*='TextBox5']")).clear();
	
	// sendkey for new Address;
	WebElement strt= driver.findElement(By.cssSelector("input[id*='TextBox2']"));
	WebElement cty= driver.findElement(By.cssSelector("input[id*='TextBox3']"));
	WebElement stat= driver.findElement(By.cssSelector("input[id*='TextBox4']"));
	WebElement zip= driver.findElement(By.cssSelector("input[id*='TextBox5']"));
	
		strt.sendKeys("5840 Atlantic Blvd.");
		cty.sendKeys("Pompano Beach");
		stat.sendKeys("FL");
		zip.sendKeys("33064");
		
		ArrayList<String> UpdatedAddress= new ArrayList<>();
		
		UpdatedAddress.add(strt.getAttribute("value"));
		UpdatedAddress.add(cty.getAttribute("value"));
		UpdatedAddress.add(stat.getAttribute("value"));
		UpdatedAddress.add(zip.getAttribute("value"));	
	
	
		// verify new Address and Update;
	if(UpdatedAddress.contains(strt.getText())& UpdatedAddress.contains(cty.getText())& UpdatedAddress.contains(stat.getText())& UpdatedAddress.contains(zip.getText()))
		{
			
			WebElement update= driver.findElement(By.cssSelector("a#ctl00_MainContent_fmwOrder_UpdateButton"));
			Thread.sleep(3000);
			update.click();
			
		}

		System.out.println("Costumer address has been updated succesfully. New Address is "+ UpdatedAddress);

		Thread.sleep(5000);
		driver.quit();
		

	}

}
