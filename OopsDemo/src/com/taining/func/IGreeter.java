package com.taining.func;

public interface IGreeter {
 void add();
 void product();
 
   default void greet() {
	   System.out.println("Hello");
   }
}
