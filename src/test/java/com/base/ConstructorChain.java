package com.base;

public class ConstructorChain {
	public ConstructorChain() {
		this(100);
		System.out.println("Parent Default");
	}
	public ConstructorChain(int id) {
		this("jagriti");
		System.out.println("id is - "+id);
	}
	public ConstructorChain(String name) {
		this(122.4554f);
		System.out.println("name is - "+name);
	}
	public ConstructorChain(float fee) {
		System.out.println("fee is - "+fee);
	}
	public static void main(String[] args) {
		ConstructorChain c = new ConstructorChain();
	}
}
