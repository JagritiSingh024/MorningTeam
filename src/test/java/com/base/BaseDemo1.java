package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseDemo1 extends BaseDemo{

	public static void main(String[] args) {
		browserlaunch();
		maxi();
		pageTitle();
		url(); 
		 
		LoginPage l = new LoginPage();
		sendValue(l.getUsername(),"Abinesh12345");
		sendValue(l.getPassword(),"59CWSV");
		clickBtn(l.getLoginBtn());
		
	}
}
