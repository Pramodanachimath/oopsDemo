package com.taining.func;

public interface IChecker {
 void add(int x);
 void cube();
 default void greet() {
	   System.out.println("Hello");
 }
}
