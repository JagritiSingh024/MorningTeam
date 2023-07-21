package com.base;



public class ChildConstructorChain extends ConstructorChain{
	public ChildConstructorChain() {
		super(211.111f);
		System.out.println("Child Default");
	}
	public static void main(String[] args) {
		ChildConstructorChain cc = new ChildConstructorChain();
		
	}

}
