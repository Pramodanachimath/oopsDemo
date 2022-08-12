package com.taining.src;

public class Employee {

	String name;
	int employeeId;
	double salary;

	public Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	void printDetails() {
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("employeeId: " + employeeId);
	}

	String greetMessage(String msg) {
		return msg + name;
	}

}
