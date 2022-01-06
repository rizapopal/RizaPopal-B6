package com.noorteck.java.day11hw;

public class Subtraction {

	public static void main(String[] args) {
		
		int diffTotal = difference21(19);
		System.out.println(diffTotal);
		
		diffTotal = difference21(10);
		System.out.println(diffTotal);
		
		diffTotal = difference21(30);
		System.out.println(diffTotal);
		
		diffTotal = difference21(21);
		System.out.println(diffTotal);
		
		
	}
	
	public static int difference21(int number) {
		
		int result = 0;
		
		if(number > 21) {
			
			result = 2 * (number - 21);
		}
		
		else {
			
			result = number - 21;
		}
		
		return result;
	}
}
