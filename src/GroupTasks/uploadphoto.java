package GroupTasks;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class uploadphoto extends CommonMethods{

	public static void main(String[] args) {
	
		
		setUpDriver("firefox", "http://www.megafileupload.com/");
		
String filename = "myphoto.jpg";
File file = new File(filename);       
String path = file.getAbsolutePath();


driver.findElement(By.cssSelector("i.fa.fa-upload")).click();
driver.findElement(By.cssSelector("div[class=internal] i.entypo-upload")).sendKeys(path);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.cssSelector("button.btn.btn-green.btn-lg")).click(); //upload button
		 
	}

}
