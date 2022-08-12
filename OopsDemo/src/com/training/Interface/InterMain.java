package com.training.Interface;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 IGames games=new User();
		 games.indoorGames();
		 games.outdoorGames();
		 System.out.println();
		 
		 games=new Student();
		 games.indoorGames();
		 games.outdoorGames();
		 System.out.println();
		
		 ICourse course=(ICourse) games;
		 
		String [] bcourse= course.backedCorse();
		 for(String courseName:bcourse)
		 {
			 System.out.println(courseName);
			
		 }
		 System.out.println();
		 
		 String [] wcourse=course.webCourses();
		 for(String courseName:wcourse)
		 {
			 System.out.println(courseName);
		 }
	}

}
