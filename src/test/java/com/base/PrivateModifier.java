package com.base;

public class PrivateModifier {
	
	private void id(int id) {
		System.out.println("Id is - "+id);
	}
	private void name(String name) {
		System.out.println("Name is - "+name);
	}
	private void fee(float fee) {
		System.out.println("Fee is - "+fee);
	}
	
	public static void main(String[] args) {
		PrivateModifier p = new PrivateModifier();
		p.id(10);
		p.name("Jagriti");
		p.fee(123.22f);
	}

}
