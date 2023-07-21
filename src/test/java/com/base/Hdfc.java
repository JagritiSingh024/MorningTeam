package com.base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.FluentFuture;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 * 
		 * driver.switchTo().frame("login_page");
		 * 
		 * driver.findElement(By.name("fldLoginUserId")).sendKeys("12345");
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		//webDriverWait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("firstframe"));
		
		
		
		driver.switchTo().frame("firstframe");
		Thread.sleep(6000);
		driver.findElement(By.id("textbox")).sendKeys("1234");
		
		//fluent
		
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).
				pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		f.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
}
