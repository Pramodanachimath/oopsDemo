package com.taining.Insurance;

public class Insurance {

	String name;
	String type;

	public Insurance(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	void insuranceDetails() {
		System.out.println("All type of insurances");

		System.out.println("name" + name);
		System.out.println("type" + type);
	}
}
