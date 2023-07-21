package com.page;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ITestListnerClass.class)
public class DemoListner extends Utility{

	@Test
	private void tc1() {
		//System.out.println("tc1");
		browserLaunch("https://www.facebook");
	}

	@Test
	private void tc2() {
		//Assert.assertTrue(false);
		//System.out.println("tc2");
		browserLaunch("https://www.amazon.in/");

	}
	/*
	 * @Test(timeOut = 1000) private void tc3() throws InterruptedException {
	 * Thread.sleep(2000); System.out.println("tc3"); }
	 */
	
	/*
	 * @Test private void tc3(){ Assert.assertTrue(false);
	 * System.out.println("tc3"); }
	 */
	
	/*
	 * @Test(dependsOnMethods = "tc2") private void tc3() {
	 * System.out.println("tc3");
	 * 
	 * }
	 */
	
	@Test
	private void tc3() {
		browserLaunch("https://www.google.com/");

	}
}
