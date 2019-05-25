package com.clasSe3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yunuskazan/Selenium/chromedriver");
		WebDriver dr = new ChromeDriver();
	
	 //registration

    dr.navigate().to("http://newtours.demoaut.com/");
//    dr.findElement(By.xpath("//td[@class='mouseOut' ]")).click();
//    dr.findElement(By.xpath("//a[@href='mercuryregister.php' ]")).click();
//    dr.findElement(By.xpath("//input[@name='firstName' ]")).sendKeys("Pascal");
//    dr.findElement(By.xpath("//input[@name='lastName' ]")).sendKeys("Nouma");
//    dr.findElement(By.xpath("//input[@name='phone' ]")).sendKeys("1190319031903");
//    dr.findElement(By.xpath("//input[@name='userName' and @id='userName' ]")).sendKeys("Pascal Nouma");
//    dr.findElement(By.xpath("//input[@name='address1' ]")).sendKeys("Vodafone Arena");
//    dr.findElement(By.xpath("//input[@name='city' ]")).sendKeys("Besiktas");
//    dr.findElement(By.xpath("//input[@name='state' ]")).sendKeys("Kartal yuvasi");
//    dr.findElement(By.xpath("//input[@name='postalCode' ]")).sendKeys("1903");
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select/option[20]")).click();;
//    dr.findElement(By.xpath("//input[@name='email' ]")).sendKeys("Pascal Nouma");
//    dr.findElement(By.xpath("//input[@name='password' ]")).sendKeys("1903");
//    dr.findElement(By.xpath("//input[@name='confirmPassword' ]")).sendKeys("1903");
//    dr.findElement(By.xpath("//input[@name='register'  ]")).click();
//    dr.findElement(By.xpath("//a[@href='mercurysignon.php'  ]")).click();
    
    //sign in
    
    dr.findElement(By.xpath("//input[@name='userName' ]")).sendKeys("Pascal Nouma");
    Thread.sleep(3000);
    dr.findElement(By.xpath("//input[@name='password' ]")).sendKeys("1903");
    Thread.sleep(3000);
    dr.findElement(By.xpath("//input[@name='login' ]")).click();
    Thread.sleep(3000);

    //find a trip
    
//    dr.findElement(By.xpath("//input[@value='oneway']")).click();
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[1]")).click();
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[4]")).click();
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option[7]")).click();
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]/option[15]")).click();
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[7]")).click();
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]/option[12]")).click();
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]/option[10]")).click();
//    dr.findElement(By.xpath("//input[@name='findFlights'  ]")).click();;
//    
//    //make reservation
//    dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click();;
//    //purchase
//    dr.findElement(By.xpath("//input[@name='passFirst0' ]")).sendKeys("Pascal");
//    dr.findElement(By.xpath("//input[@name='passLast0' ]")).sendKeys("Nouma");
//    dr.findElement(By.xpath("//input[@name='creditnumber' ]")).sendKeys("1111222233334444");
//    dr.findElement(By.xpath("//input[@name='buyFlights']")).click();

}
}