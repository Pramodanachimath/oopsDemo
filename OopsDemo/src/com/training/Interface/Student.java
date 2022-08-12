package com.training.Interface;

public class Student implements IGames, ICourse {

	@Override
	public String[] webCourses() {
		
		return new String[]{"HTML","Css","JavaScript"};
	}

	@Override
	public String[] backedCorse() {
		
		return new String[]{"Java","Python","JavaScript"};
	}

	@Override
	public void outdoorGames() {
		System.out.println("baseball");

	}

	@Override
	public void indoorGames() {
		System.out.println("chess");

	}

}
