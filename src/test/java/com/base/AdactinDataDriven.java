package com.base;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.Maxifs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdactinDataDriven extends BaseDemo{

	@Test
	private void tc1() throws IOException {
		browserlaunch();
		maxi();
		  
		driver.findElement(By.id("username")).sendKeys(stringData(0,0));
		driver.findElement(By.id("password")).sendKeys(stringData(0,1));
		driver.findElement(By.id("login")).click();
		
		 WebElement locn = driver.findElement(By.id("location"));
		  Select s = new Select(locn);
		  s.selectByValue(stringData(0,2));
		  
		  WebElement hotel = driver.findElement(By.id("hotels"));
		  Select h = new Select(hotel);
		  h.selectByValue(stringData(0,3));
		  
		  WebElement rtype = driver.findElement(By.id("room_type"));
		  Select r = new Select(rtype);
		  r.selectByValue(stringData(0,4));
		  
		  WebElement rnos = driver.findElement(By.id("room_nos"));
		  Select rn = new Select(rnos);
		  rn.selectByValue(numericData(0,5));
		  
		  WebElement dateIn = driver.findElement(By.id("datepick_in"));
		  dateIn.sendKeys(numericData(0,6));
		  
		  WebElement dateOut = driver.findElement(By.id("datepick_out"));
		  dateOut.sendKeys(numericData(0,7));
		  
		  WebElement aRoom = driver.findElement(By.id("adult_room"));
		  Select ar = new Select(aRoom);
		  ar.selectByValue(numericData(0,8));
		  
		  WebElement cRoom = driver.findElement(By.id("child_room"));
		  Select cr = new Select(cRoom);
		  cr.selectByValue(numericData(0,9));
		  
		  driver.findElement(By.id("Submit")).click();
		  driver.findElement(By.id("radiobutton_0")).click();
		  driver.findElement(By.id("continue")).click();
		  
		  driver.findElement(By.id("first_name")).sendKeys(stringData(0,10));
		  driver.findElement(By.id("last_name")).sendKeys(stringData(0,11));
		  driver.findElement(By.id("address")).sendKeys(stringData(0,12));
		  driver.findElement(By.id("cc_num")).sendKeys(numericData(0,13));
	
		  WebElement cType = driver.findElement(By.id("cc_type"));
		  Select ct = new Select(cType);
		  ct.selectByValue(stringData(0,14));
		  
		  WebElement cExMonth = driver.findElement(By.id("cc_exp_month"));
		  Select cxm = new Select(cExMonth);
		  cxm.selectByValue(numericData(0,15));
		  
		  WebElement cExYear = driver.findElement(By.id("cc_exp_year"));
		  Select cxy = new Select(cExYear);
		 cxy.selectByValue(numericData(0,16));
		  
		  driver.findElement(By.id("cc_cvv")).sendKeys(numericData(0,17));
		  driver.findElement(By.id("book_now")).click();
	
	}
	
	
}
