package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//maximize size
		driver.manage().window().maximize();

		//To click on the create button
		WebElement createButton = driver.findElement(By.linkText("Create new account"));
	    createButton.click();
	    
	    Thread.sleep(3000);
		
	  //To send value to the firstname text box
	  WebElement fname = driver.findElement(By.name("firstname"));
	  fname.sendKeys("jagriti");
	  
	  WebElement lname = driver.findElement(By.name("lastname"));
	  lname.sendKeys("singh");
	  
	  WebElement email = driver.findElement(By.name("reg_email__"));
	  email.sendKeys("jagriti@gmail.com");
	  
	  WebElement emailConfirm = driver.findElement(By.name("reg_email_confirmation__"));
	  emailConfirm.sendKeys("jagriti@gmail.com");
	  
	  WebElement pwd = driver.findElement(By.name("reg_passwd__"));
	  pwd.sendKeys("J23456");
	  
	  WebElement day = driver.findElement(By.id("day"));
	  Select d = new Select(day);
	  d.selectByIndex(23);
	  
	  WebElement month = driver.findElement(By.id("month"));
	  Select m = new Select(month);
	  m.selectByIndex(4);  
	  
	  WebElement year = driver.findElement(By.id("year"));
	  Select y = new Select(year);
	  y.selectByIndex(31);  
	 
	  WebElement sex = driver.findElement(By.name("sex"));
	  sex.click();
	  
	  WebElement websubmit = driver.findElement(By.name("websubmit"));
	  websubmit.click();
	 
	}

}
