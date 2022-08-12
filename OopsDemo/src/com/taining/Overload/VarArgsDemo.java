package com.taining.Overload;

public class VarArgsDemo {

	 void calSum(int...marks) {
		 System.out.println("Welcome ");
		 int sum=0;
		 for(int val:marks)
		 {
			 sum+=val;
			 
		 }
		 System.out.println("sum = "+sum);
	 }
	 
	 public static void main(String[] args) {
		VarArgsDemo varargs=new VarArgsDemo();
		varargs.calSum();
		varargs.calSum(10,80,90);
		varargs.calSum(90,80,90,80);
		varargs.calSum(90,80);
	}
}
