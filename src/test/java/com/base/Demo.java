package com.base;

public class Demo extends BaseDemo{

	public static void main(String[] args) {
		browserlaunch();
		maxi();
		
		
		  LoginPage l = new LoginPage(); sendValue(l.getUsername(),"hello");
		  sendValue(l.getPassword(),"12345"); clickBtn(l.getLoginBtn());
		 
		
	}
}
