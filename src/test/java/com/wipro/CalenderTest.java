package com.wipro;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderTest {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='sc-fjdhpX jxFepI']")).click();
		

		String year = "2023";
		String month = "November";
		String date = "20";

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

		while (true) {
			WebElement title = driver.findElement(By.xpath("//*[@class='DayNavigator__CalendarHeader-sc-1tlckkc-1 ccLrBz']"));
			String text = title.getText();

			String split[] = text.split(" ");
			String mon = split[0];
			String yr = split[1];

		  Thread.sleep(3000);
			  if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
				  break;
			  } 
			  else { 
				  driver.findElement(By.id("next")).click(); 
			  } 
		}
		 Thread.sleep(3000);
		  
		  List<WebElement> date1 = driver.findElements(By.xpath("//*[@class='DayTilesWrapper__DayWrapper-moo2xh-1 loqlv']")); 
		  for(WebElement w : date1) {
			  String text = w.getText(); 
			  if(text.equals(date)) {
		         w.click(); 
		         break; 
		      } 
		  }
		 
	} // main

} // class
