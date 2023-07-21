package com.base;

public class PublicModifier1 extends PublicModifier{
	
	public String name = "hello";
	public void name(String name) {
		System.out.println("Name is - "+name);
	}
	
	public static void main(String[] args) {
		PublicModifier1 p = new PublicModifier1();
		p.id(10);
		p.name("Jagriti");
		p.fee(123.11f);
	
	}

}
