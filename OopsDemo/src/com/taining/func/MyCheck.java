package com.taining.func;

import java.security.PublicKey;

public class MyCheck implements IGreeter, IChecker {

	@Override
	public void cube() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add() {
		System.out.println("Adding");
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
			
		}
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		IChecker.super.greet();
		IGreeter.super.greet();
		System.out.println("my greetings in class");
	}

	public static void main(String[] args) {
		IGreeter ref=new MyCheck();
		ref.add();
		ref.greet();
	}

	@Override
	public void add(int x) {
		// TODO Auto-generated method stub
		
	}
	}


