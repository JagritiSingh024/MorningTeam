package com.base;

import junit.framework.Assert;

public class SampleScreenshot extends BaseDemo{

	public void tc1() {
		browserlaunch(); 
		maxi();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		 LoginPage l = new LoginPage(); 
		 sendValue(l.getUsername(),"hello");
		 sendValue(l.getPassword(),"12345"); 
		 clickBtn(l.getLoginBtn()); 
		 
	}
}
