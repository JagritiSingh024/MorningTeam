package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement down = driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
		WebElement up = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		//downcasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", up);

	}
}
