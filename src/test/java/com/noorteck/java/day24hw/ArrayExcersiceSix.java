package com.noorteck.java.day24hw;

public class ArrayExcersiceSix {

public static void main(String[] args) {
		
		int n1 [] = {6, 1, 2, 3};
		int n2 [] = {13, 2, 3, 4, 6, 1, 2, 3};
		int n3 [] = {3, 3, 0, 1, 4, 3, 6};
		int n4 [] = {2, 6, 2};
		
		boolean resultOne = checkNum(n1);
		
		boolean resultTwo = checkNum(n2);
		
		boolean resultThree = checkNum(n3);
		
		boolean resultFour = checkNum(n4);
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
		
		System.out.println(resultFour);
		
	} //end of main method
	
	protected static boolean checkNum(int [] number) {
		
		boolean result = false;
		
		int num1 = 0;
		int num2 = 0;
		int indexOfFirst = 0;
		
		for(int i = 0; i < number.length; i++) {
			
			if(number[i] == 2) {
				
				num1 = 2;
				indexOfFirst = i;
				break;
				
			} else if(number[i] == 5) {
				
				num1 = 5;
				indexOfFirst = i;
				break;
				
			} //end of else if
			
		} //end of for loop
		
		for(int i = indexOfFirst + 1; i < number.length; i++) {
			
			if(number[i] == 2) {
				
				num2 = 2;
				break;
				
			} else if(number[i] == 5) {
				
				num2 = 5;
				break;
				
			} //end of else if
		} //end of for loop
		
		if(num1 == 2 && num2 == 2) {
			
			result = true;
			
		} else if(num1 == 5 && num2 == 5) {
			
			result = true;
		}
		
		return result;
		
	} //end of method
	
} //end of class
