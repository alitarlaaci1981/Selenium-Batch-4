package GroupTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.clasSe2.webDriverCommands;

import utils.CommonMethods;

public class Task3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * TC 1: Users Application Form Fill
		 * 1.Open chrome browser
		 * 2.Go to “http://uitestpractice.com/”
		 * 3.Click on “Forms” link
		 * 4.Fill out the entire form
		 * 5.Close the browser
		 * MUST USE Functions: 
		 */
		String value= "http://uitestpractice.com/";
		
		setUpDriver("chrome", value);
		
		WebElement  clickform= driver.findElement(By.xpath("//a[text()='Form']"));
		
		actionClick(clickform);
		
		WebElement username= driver.findElement(By.cssSelector("input#firstname"));
		value= "Yunus";
		sendText(username, value);
		
		
		WebElement lastname= driver.findElement(By.cssSelector("input#lastname"));
		value= "Kazan";
		sendText(lastname, value);
		
		// we only couldn't figure out this radio button function. we tried all way we learned, but i does not work properly;
		List<WebElement> element1= driver.findElements(By.cssSelector("input[type='radio']"));
		value= "Single";
		radioButton(element1, value);
		

		List<WebElement> hobbies= driver.findElements(By.cssSelector("label.checkbox-inline"));
		checkBox(hobbies, "All");
			
		// MultipleCheckBox(hobbies, "Cricket", "Dancing", "Reading");
		
		
		WebElement element= driver.findElement(By.cssSelector("select#sel1"));
		
		value= "Egypt";
				
		dropDown(element, value);
		
		WebElement datebox= driver.findElement(By.cssSelector("input[placeholder='Enter Date of birth']"));
		datebox.click();
		
		
		String month= "Jun";
		WebElement Month= driver.findElement(By.cssSelector("select[data-handler='selectMonth']"));
		dropDown(Month, month);
		
		
		String year = "1987";
		WebElement Year= driver.findElement(By.cssSelector("select[data-handler='selectYear']"));
		dropDown(Year, year);
		
		
		
		String Day= "26";
		List<WebElement> Table= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		calender(Table, Day);
		
		element= driver.findElement(By.cssSelector("input[placeholder='Enter PhoneNumber']"));
		value= "7613083456";
		sendText(element, value);
		
		element= driver.findElement(By.cssSelector("input[placeholder='Enter UserName']"));
		value= "yunuskazan81";
		sendText(element, value);
		
		element= driver.findElement(By.cssSelector("input#email"));  
		value= "yunuskazan81@gmail.com";
		sendText(element, value);
		
		
		element= driver.findElement(By.cssSelector("textarea#comment"));    
		value= "I am a Software Automation Test Engineer";
		sendText(element, value);
		
		
		element= driver.findElement(By.cssSelector("input#pwd"));
		value= "yKaz198781.";
		sendText(element, value);
		
		Thread.sleep(10000);
		element= driver.findElement(By.cssSelector("button[type='submit']"));
		clickElement(element);
		
		
		
		
		Thread.sleep(1000);
		
		driver.close();

	}

}
