package com.training.extend;

public class StarInsurance implements HealthPolicy {

	@Override
	public void policyDetails() {
		System.out.println("20 years experience");

	}

	@Override
	public void healthCoverage() {
		System.out.println("coverage for long term illness");
		System.out.println("Quaterly Premium");

	}

}
