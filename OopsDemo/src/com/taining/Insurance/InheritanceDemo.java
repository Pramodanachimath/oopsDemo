package com.taining.Insurance;

public class InheritanceDemo {

	public static void main(String[] args) {

		Insurance insurance=new Insurance("LIC",);
		
		GeneralInsurance ginsurance=new GeneralInsurance();
		ginsurance.insuranceDetails();
		ginsurance.policytype();
		
		LifeInsurance life=new LifeInsurance();
		life.insuranceDetails();
	}

}
