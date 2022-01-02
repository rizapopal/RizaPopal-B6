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
		
		if(gender == 'm' || gender == 'M') { // (4) it sees if the value of gender is 'm' or 'M'; i
	
			System.out.println("Male");
			
		} else if(gender == 'f' || gender == 'F') {
			
			System.out.println("Female");
			
		}
		
		
	}
}
