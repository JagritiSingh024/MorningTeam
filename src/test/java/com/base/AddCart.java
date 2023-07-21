package com.base;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCart extends AmazonBase {

	public static void main(String[] args) throws InterruptedException {
		  browserlaunch();
		  maxi();
		  System.out.println("test 1 done");

		  AmazonBase l = new AmazonBase();
		  
		  sendValue(l.getSearch(),"Apple i phone");
		  System.out.println("test 2 done");
		  
		  clickBtn(l.getSearchBtn());
		  System.out.println("test 3 done");
		  
		  clickBtn(l.getClickLink());
		  System.out.println("test 4 done");
		  
		  //parent 
		  String parentWindow = driver.getWindowHandle();
		  System.out.println(parentWindow);
		  //all window 
		  Set<String> childWindow = driver.getWindowHandles();
		  
		 System.out.println(childWindow);
		  
		  for(String allId : childWindow) { 
			  if(!parentWindow.equals(allId)) {
		        driver.switchTo().window(allId); 
		      }
		  }
		  clickBtn(l.getAddCart());
		  System.out.println("test 5 done"); 
	}
}
