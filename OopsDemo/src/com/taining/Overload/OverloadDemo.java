package com.taining.Overload;

public class OverloadDemo {

	public static void main(String[] args) {

		Shape shape = new Shape();

		shape.calcArea(10);
		shape.calcArea(20.5);

		System.out.println(shape.calcArea(10, 15));

		System.out.println(shape.calcArea(10, 10.5f));

	}

}
