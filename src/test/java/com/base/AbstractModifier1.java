package com.base;

public class AbstractModifier1 extends AbstractModifier{

	@Override
	public void id(int id) {
		System.out.println("Id is - "+id);
	}

	@Override
	public void name(String name) {
		System.out.println("Name is - "+name);
	}

	@Override
	public void fee(float fee) {
		System.out.println("Fee is - "+fee);
	}
	public static void main(String[] args) {
		AbstractModifier1 a = new AbstractModifier1();
		a.id(10);
		a.name("jagriti");
		a.fee(123.22f);
	}

}
