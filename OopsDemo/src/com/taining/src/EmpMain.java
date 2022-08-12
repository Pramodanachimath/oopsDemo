package com.taining.src;

public class EmpMain {

	public static void main(String[] args) {

		Employee employee = new Employee("Ram",22,20000);
		/*
		 * employee.name = "Pam"; employee.employeeId = 302038; employee.salary = 30000;
		 */
		
		employee.printDetails();
		System.out.println(employee.greetMessage("Have a great day "));
		System.out.println();

		/*
		 * System.out.println("Name: " + employee.name);
		 * System.out.println("employeeId: " + employee.employeeId);
		 * System.out.println("salary: " + employee.salary); System.out.println();
		 */
		Employee employee2 = new Employee("Pam",23,220000);
		/*
		 * employee2.name = "Ram"; employee2.employeeId = 32015646; employee2.salary =
		 * 120000;
		 */
		
		employee2.printDetails();
		System.out.println(employee2.greetMessage("Hi good Morning "));

		/*
		 * System.out.println("name: " + employee2.name);
		 * System.out.println("employeeId: " + employee2.employeeId);
		 * System.out.println("salary: " + employee2.salary);
		 * 
		 * Employee aemployee = employee; System.out.println("employee1 :" +
		 * employee.salary); System.out.println("employee2 :" + aemployee.salary);
		 * System.out.println();
		 * 
		 * employee.salary = 5000; System.out.println("employee1 :" + employee.salary);
		 * System.out.println("employee2 :" + aemployee.salary); System.out.println();
		 * 
		 * employee = null; System.out.println("employee2 :" + aemployee.salary);
		 * System.out.println("employee1 :" + employee.salary);
		 */
	}
}
