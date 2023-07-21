package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\emb-madhtom\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		WebElement loginText = driver.findElement(By.className("login_title"));
		String text = loginText.getText();
		//System.out.println("Login Text is : " + text);
		
		driver.findElement(By.id("username")).sendKeys("abinesh1990");
		driver.findElement(By.id("password")).sendKeys("Abinesh123");
		driver.findElement(By.id("login")).click();
		  

		  WebElement loc = driver.findElement(By.id("location"));
		  Select s = new Select(loc);
		  s.selectByIndex(2);
		  
		  WebElement hotel = driver.findElement(By.id("hotels"));
		  Select h = new Select(hotel);
		  h.selectByIndex(2);
		  
		  WebElement rtype = driver.findElement(By.id("room_type"));
		  Select r = new Select(rtype);
		  r.selectByIndex(2);
		  
		  WebElement rnos = driver.findElement(By.id("room_nos"));
		  Select rn = new Select(rnos);
		  rn.selectByIndex(2);
		  
		  WebElement dateIn = driver.findElement(By.id("datepick_in"));
		  dateIn.sendKeys("30/04/2023");
		  
		  WebElement dateOut = driver.findElement(By.id("datepick_out"));
		  dateOut.sendKeys("01/05/2023");
		  
		  WebElement aRoom = driver.findElement(By.id("adult_room"));
		  Select ar = new Select(aRoom);
		  ar.selectByIndex(2);
		  
		  WebElement cRoom = driver.findElement(By.id("child_room"));
		  Select cr = new Select(cRoom);
		  cr.selectByIndex(2);
		  
		  driver.findElement(By.id("Submit")).click();
		  driver.findElement(By.id("radiobutton_0")).click();
		  driver.findElement(By.id("continue")).click();
		  
		  //driver.findElement(By.id("first_name")).sendKeys("Jagriti");
		  //driver.findElement(By.id("last_name")).sendKeys("Singh");
		  //driver.findElement(By.id("address")).sendKeys("Bangalore");
		  //driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
	
		  WebElement cType = driver.findElement(By.id("cc_type"));
		  Select ct = new Select(cType);
		  ct.selectByIndex(2);
		  
		  WebElement cExMonth = driver.findElement(By.id("cc_exp_month"));
		  Select cxm = new Select(cExMonth);
		  //cxm.selectByIndex(2);
		  
		  WebElement cExYear = driver.findElement(By.id("cc_exp_year"));
		  Select cxy = new Select(cExYear);
		 // cxy.selectByIndex(2);
		  
		  //driver.findElement(By.id("cc_cvv")).sendKeys("333");
		  //driver.findElement(By.id("book_now")).click();
		  
		   WebElement eMsg = driver.findElement(By.id("process_span"));
		   String errorMsg = eMsg.getText();
		   //System.out.println(errorMsg);  
	}

}
