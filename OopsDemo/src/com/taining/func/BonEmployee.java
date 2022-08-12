package com.taining.func;

public class BonEmployee implements IBonusCalculator {

	@Override
	public void printAllowances() {
		// TODO Auto-generated method stub
		IBonusCalculator.super.printAllowances();
		System.out.println("house Allowance");
	}

	@Override
	public void calBonus(int amount) {
		System.out.println("Bonus is :"+(amount*2));

	}

}
