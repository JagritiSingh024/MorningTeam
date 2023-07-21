package com.base;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FbDebug extends fbBase {
	
	@Test
	private void tc1() {
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		//driver.findElement(By.id("password")).sendKeys("1234");
		//driver.findElement(By.id("login")).click();
	}



	

}
