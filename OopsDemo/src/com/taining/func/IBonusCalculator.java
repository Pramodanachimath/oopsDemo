package com.taining.func;

public interface IBonusCalculator {
	
 void calBonus(int amount);
 default void printAllowances() {
	 
	 System.out.println("Car Allowance");
	
 }

}
