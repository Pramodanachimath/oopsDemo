package com.training.abstraction;

abstract public class BranchMain {

	public static void main(String[] args) {

		Bank bank = new Branch1();
		bank.carLoan();
		bank.educationLoan();
		bank.houseLoan();
		bank.admin();
		System.out.println();

		Branch1 branch1 = (Branch1) bank;
		branch1.branchDetails();
		System.out.println();

		bank = new SubBranch();
		bank.carLoan();
		bank.educationLoan();
		bank.houseLoan();
		bank.admin();
		System.out.println();
		
		Branch2 branch2=(Branch2)bank;
		branch2.loanDetails();
		System.out.println();

		SubBranch sub = (SubBranch) bank;
		sub.carLoan();
		sub.educationLoan();
		sub.houseLoan();
		sub.termPlans();
		sub.loanDetails();

	}

}
