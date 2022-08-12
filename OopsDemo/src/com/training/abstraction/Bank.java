package com.training.abstraction;

public abstract class Bank {

	abstract void carLoan();

	abstract void educationLoan();

	abstract void houseLoan();

	void admin() {
		System.out.println("Bank admin details");
	}
}
