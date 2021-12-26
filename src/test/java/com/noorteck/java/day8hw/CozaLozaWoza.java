package com.noorteck.java.day8hw;

/**
 * JavaDay8 HW: Question 1 
 * Involving for-loop, if-else statements, modular% operation 
 * Prints either Coza, Loza, Woza, or CozaLoza dependeding on if its a mutiple of 3,5,7, or 3 & 5
 * 
 * @author rizapopal
 *
 */

public class CozaLozaWoza {
	
	public static void main(String [] args) {
		
		for(int i = 1; i <= 36; i++) {
			
			if( ((i % 3) == 0) && ((i % 5) == 0) ) {
				
				System.out.println("CozaLoza");
				
			} else if( (i % 5) == 0) {
				
				System.out.println("Loza");
				
			} else if( (i % 7) == 0) {
				
				System.out.println("Woza");
				
			} else if( ((i % 3) == 0)) {
				
				System.out.println("Coza");
				
			} 
			
			else {
				
				System.out.println(i);
			}
			
			
			
			
		}
	}

}
