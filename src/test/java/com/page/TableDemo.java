package com.page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		 
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
		
		//maximize size
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> allHeaders = driver.findElements(By.xpath("//*[@id='customers']//th"));
		
		int size = allHeaders.size();
		System.out.println(size);
		
		for(WebElement w : allHeaders) {
			String text = w.getText();
			System.out.println(text);
		}
		
	}
	
}



