package com.base;

import org.junit.Test;

import junit.framework.Assert;

public class JunitAssert extends BaseDemo{

	@Test
	public void tc1() {
		browserlaunch(); 
		maxi();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Hard assert
		Assert.assertEquals("https://www.facebook.com/", url);
		System.out.println("Tc1 done");
	}
	@Test
	public void tc2() {
		System.out.println("TC2 Method");
	}
	
}
