package com.wipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLaunchMethod {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver","C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\driver\\msedgedriver.exe");

		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("headless");
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	}

}
