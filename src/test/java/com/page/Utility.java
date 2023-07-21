package com.page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	public static WebDriver driver;
	public static void browserLaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);
		
		//maximize size
		driver.manage().window().maximize();

	}
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/"+ filename +".jpeg");
		FileUtils.copyFile(source, destination);
		
	}

}
