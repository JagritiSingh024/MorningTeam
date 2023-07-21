package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/Register.php");
		
		//maximize size
		driver.manage().window().maximize();
		
		  //To send value to the firstname text box
		  WebElement userName = driver.findElement(By.id("username"));
		  userName.sendKeys("jagritis");
		  
		  WebElement pwd = driver.findElement(By.id("password"));
		  pwd.sendKeys("123456");
		  
		  WebElement confirmPwd = driver.findElement(By.id("re_password"));
		  confirmPwd.sendKeys("123456");
		  
		  WebElement fullName = driver.findElement(By.id("full_name"));
		  fullName.sendKeys("Jagriti Singh");
		  
		  WebElement email = driver.findElement(By.id("email_add"));
		  email.sendKeys("jagriti@gmail.com");
		  
		  WebElement tnc = driver.findElement(By.id("tnc_box"));
		  tnc.click();
		  
		  WebElement register = driver.findElement(By.id("Submit"));
		  register.click();
	}

}
