package com.noorteck.java.day12hw;

public class PositiveNegativeMethodDemo {

	public static void main(String[] args) {
		
		boolean result = posNeg(1, -1, false);
		System.out.println(result);
		
		result = posNeg(-1, 1, false);
		System.out.println(result);
		
		result = posNeg(-4, -5, true);
		System.out.println(result);
		
		result = posNeg(1, 2, true);
		System.out.println(result);
		
		result = posNeg(1, 2, false);
		System.out.println(result);
		
		
	}
	public static boolean posNeg(int numOne, int numTwo, boolean trueOrFalse) {
		
		boolean result = false;
		
		if(numOne < 0 && numTwo > 0 && trueOrFalse == false ) {
			
			result = true;
			
		} else if(numOne > 0 && numTwo < 0 && trueOrFalse == false) {
			
			result = true;
			
		} else if(numOne < 0 && numTwo < 0 && trueOrFalse == true ){
			
			result = true;
			
		}
	
		else {
			result = false;
		}
		
		return result;
	}
}
