package com.training.abstraction;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Branch1 carLoan");
	}

	@Override
	void educationLoan() {
		System.out.println("Branch1 educationLoan");

	}

	@Override
	void houseLoan() {
		System.out.println("Branch1 houseLoan");

	}

	void branchDetails() {
		System.out.println("Branch1 details");
	}
}
