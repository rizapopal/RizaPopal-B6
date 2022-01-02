package com.noorteck.java.day10hw;

public class GenderMethod {

	public static void main(String[] args) {

		getGender('m'); // (1) calls on method and passes value 'm' to parameter in getGender method
		getGender('M');
		
		getGender('f');
		getGender('F');
		

	}

	public static void getGender(char gender) { // (2) gender variable is given 'm' value
		
		// (3) we go in method body
		
		if(gender == 'm' || gender == 'M') { // (4) it sees if the value of gender is 'm' or 'M'; if it is, it will print male, otherwise it will go to else if statement
	
			System.out.println("Male");
			
		} else if(gender == 'f' || gender == 'F') { // (5) if the if statement condition was not met, it checks else if statement and if else if condition is met, then outputs female
			
			System.out.println("Female");
			
		}
		
		
	} // (6) goes back to main method to execute next lines of code
}
