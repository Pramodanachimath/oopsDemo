package com.training.extend;

public class AckoInsurance implements MotorPolicy {

	@Override
	public void policyDetails() {
		System.out.println("proides various new policies");

	}

	@Override
	public void carInsurance() {
		System.out.println("car insurance against accidents");
	}

	@Override
	public void bikeInsurance() {
		System.out.println("bike insurance against damage");

	}

}
