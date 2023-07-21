package com.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoAnno {
	
	@BeforeClass
	public static void beforelass1() {
		System.out.println("beforelass1");
	}
	@BeforeClass
	public static void beforelass2() {
		System.out.println("beforelass2");
	}
	@Before
	public void before() {
		System.out.println("before");

	}
	@Test
	public void tc1() {
		System.out.println("tc1");
	}
	@Test
	public void tc2() {
		System.out.println("tc2");
	}
	@After
	public void after() {
		System.out.println("after");

	}
	 @AfterClass
	 public static void afterClass() {
		 System.out.println("afterlass");

	}

}
