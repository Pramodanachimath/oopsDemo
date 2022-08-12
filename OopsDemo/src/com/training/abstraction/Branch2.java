package com.training.abstraction;

public abstract class Branch2 extends Bank {

	@Override
	void educationLoan() {
		System.out.println("Branch2 educationLoan");

	}

	@Override
	void houseLoan() {
		System.out.println("Branch2 houseLoan");

	}

	void loanDetails() {
		System.out.println("Branch2 loanDetails");
	}
}
