package com.taining.function;

public class LamdaDemo {

	public static void main(String[] args) {

		
		INewInsurance insurance= ()-> System.out.println("Vehicle Insurance");
		insurance.policyDetails();
		
		insurance= ()-> System.out.println("Health Insurance");
		insurance.policyDetails();
		
		insurance= ()-> System.out.println("Life Insurance");
		insurance.policyDetails();
	}

}
