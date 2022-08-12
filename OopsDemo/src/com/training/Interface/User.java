package com.training.Interface;

public class User implements IGames{

	@Override
	public void outdoorGames() {
	 System.out.println("football");
	 System.out.println("cricket");
		
	}

	@Override
	public void indoorGames() {
		 System.out.println("table tennis");
		 System.out.println("chess");
	}
	

}
