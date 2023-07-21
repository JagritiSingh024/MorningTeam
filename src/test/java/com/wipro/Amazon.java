package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//maximize size
		driver.manage().window().maximize();
		
		  WebElement fname = driver.findElement(By.id("twotabsearchtextbox"));
		  fname.sendKeys("iphone 14");
		  
		  WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		  searchButton.click();
		  Thread.sleep(3000);
		  
		  WebElement firstLink = driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue"));
		  firstLink.click();
		  
		
	}

}
