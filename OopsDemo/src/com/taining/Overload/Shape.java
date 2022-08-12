package com.taining.Overload;

public class Shape {

	void calcArea(int x) {
		System.out.println("sq " + (x * x));
	}

	void calcArea(double x) {
		System.out.println("circle " + (Math.PI * x * x));
	}

	int calcArea(int x, int y) {
		return x * y;
	}

	double calcArea(int x, float y) {
		return 0.5 * x * y;
	}

}
