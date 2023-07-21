package com.base;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		//parent
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		//all window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		
		for(String allId : childWindow) {
			if(!parentWindow.equals(allId)) {
				driver.switchTo().window(allId);
				driver.findElement(By.id("firstName")).sendKeys("jagriti");
				driver.findElement(By.id("lastName")).sendKeys("singh");
				driver.findElement(By.id("femalerb")).click();
				driver.findElement(By.id("chinesechbx")).click();
				driver.findElement(By.id("email")).sendKeys("jagriti@gmail.com");
				driver.findElement(By.id("password")).sendKeys("12345");
				driver.findElement(By.id("registerbtn")).click();
				System.out.println("done 1");
			}
			
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("jagriti");
		System.out.println("done 2");
	}
}
