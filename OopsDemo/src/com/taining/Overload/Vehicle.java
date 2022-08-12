package com.taining.Overload;

public class Vehicle {

	String model;
	String brand;
	double price;

	public Vehicle() {
		System.out.println("Vehicle details");
	}

	public Vehicle(String model) {
		this();
		System.out.println("One con "+price);
		this.model = model;
	}

	public Vehicle(String model, double price) {
		
		this(model);
		System.out.println("Two con "+price);
		this.price = price;
	}

	public Vehicle(String model, String brand, double price) {
		
	    this(model,price);
		this.brand = brand;
		System.out.println("Three con "+price);
	}

	void printDetaisl() {
		if (model != null)
			System.out.println("model: " + model);
		if (brand != null)
			System.out.println("brand: " + brand);
		if (price >0.0) {
			System.out.println("price: " + price);
		} 
	}

}
