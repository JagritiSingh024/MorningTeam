package com.base;

public class DefaultModifier {
	
	void id(int id) {
		System.out.println("Id is - "+id);
	}
	void name(String name) {
		System.out.println("Name is - "+name);
	}
	void fee(float fee) {
		System.out.println("Fee is - "+fee);
	}
	
	public static void main(String[] args) {
		DefaultModifier d = new DefaultModifier();
		d.id(0);
		d.name("Jagriti");
		d.fee(123.22f);
	}

}
