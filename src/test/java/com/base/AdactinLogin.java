package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.AbstractParallelWorker.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','jagriti')", user);
		js.executeScript("arguments[0].setAttribute('value','1234')", pass);
		js.executeScript("arguments[0].click", login);
		
		Object username = js.executeScript("return arguments[0].getAttribute('value')", user);
		Object password = js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(username);
		System.out.println(password);
	}

}
