package com.base;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestng extends BaseDemo{
	
	/*
	 * @Test private void tc1(){
	 * 
	 * browserlaunch(); maxi();
	 * 
	 * LoginPage l = new LoginPage(); userValue(l.getUser(),"hello");
	 * userValue(l.getPass(),"12345"); clickBtn(l.getLoginBtn()); }
	 */
	
	@BeforeSuite
	private void beforeSuite() {
		System.out.println("before suite");
	}
	@BeforeTest
	private void beforeTest() {
		System.out.println("before Test");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");

	}
	@Test(invocationCount=2 , priority=2)
	public void tc1() {
		System.out.println("tc1");
	}
	@Test(priority=1)
	public void tc2() {
		System.out.println("tc2");
	}
	@Test(enabled=false)
	public void tc3() {
		System.out.println("tc3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");

	}
	 @AfterClass
	 public static void afterClass() {
		 System.out.println("after class");

	}
	 @AfterTest
	 public static void afterTest() {
		 System.out.println("after Test");
	}
	 @AfterSuite
	 public static void afterSuite() {
		 System.out.println("after Suite");
	}

}
