package com.taining.function;

public class AnonymusMain {

	public static void main(String[] args) {

		INewInsurance newInsurance = new INewInsurance() {
			
			@Override
			public void policyDetails() {
				System.out.println("vehicle Insurance");
				
			}
		};
		newInsurance.policyDetails();

		newInsurance = new INewInsurance() {
			
			@Override
			public void policyDetails() {
				System.out.println("Health Insurance");
				
			}
		};
		newInsurance.policyDetails();

		newInsurance = new INewInsurance() {
			
			@Override
			public void policyDetails() {
				System.out.println("Life Insurance");
				
			}
		};
		newInsurance.policyDetails();

	}

}
