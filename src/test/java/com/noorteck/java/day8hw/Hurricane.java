package com.noorteck.java.day8hw;

/**
 * JavaDay8 HW: Question 2
 * Uses while loop and if-else statements to display wind speed and category of a hurricane
 * 
 * @author rizapopal
 *
 */

public class Hurricane {
	
	public static void main(String[] args) {
		
		int windSpeed = 20;
		
		while( (windSpeed >= 20) && (windSpeed <= 200) ) {
			
			
			if( (windSpeed>=74) && (windSpeed <= 95) ) {
				
				System.out.println("The windspeed of the Hurricane is: " + windSpeed);
				System.out.println("The category of the Hurricane is 1");
				System.out.println("----------------------------------------------------");
				
				
			} else if( (windSpeed>=105) && (windSpeed <= 110) ) {
				
				System.out.println("The windspeed of the Hurricane is: " + windSpeed);
				System.out.println("The category of the Hurricane is 2");
				System.out.println("----------------------------------------------------");
				
			} else if( (windSpeed>=120) && (windSpeed <= 130) ) {
				
				System.out.println("The windspeed of the Hurricane is: " + windSpeed);
				System.out.println("The category of the Hurricane is 3");
				System.out.println("----------------------------------------------------");
				
				
			} else if( (windSpeed>=140) && (windSpeed <= 155) ) {
				
				System.out.println("The windspeed of the Hurricane is: " + windSpeed);
				System.out.println("The category of the Hurricane is 4");
				System.out.println("----------------------------------------------------");
				
			} else if( (windSpeed>=140) && (windSpeed <= 155) ) {
				
				System.out.println("The windspeed of the Hurricane is: " + windSpeed);
				System.out.println("The category of the Hurricane is 5");
				System.out.println("----------------------------------------------------");
				
			}
			
			windSpeed++;
		}
	}
}
