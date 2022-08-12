package com.training.extend;

public class InMain {

	public static void main(String[] args) {

		HealthPolicy hpolicy=new StarInsurance();
		hpolicy.policyDetails();
		hpolicy.healthCoverage();
		System.out.println();
	     	
	
		MotorPolicy mpolicy=new AckoInsurance();
		mpolicy.policyDetails();
		mpolicy.bikeInsurance();
		mpolicy.carInsurance();
	}

}
