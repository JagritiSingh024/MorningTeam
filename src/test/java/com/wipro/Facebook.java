package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		   
		WebElement fbText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		String text = fbText.getText();
		System.out.println("Facebook Text is : "+ text);
		
	}
}
