package com.noorteck.java.day10hw;

public class OddEvenMethod {

	public static void main(String[] args) {
		
		oddEven(7);
		oddEven(10);

	}
	
	public static void oddEven (int number) {
		
		if(number % 2 == 0) {
			
			System.out.println(number + " is an Even Number!");
			
		} else if(number % 2 == 1) {
			
			System.out.println(number + " is an Odd Number!");
			
		}
		
		
	}


}
