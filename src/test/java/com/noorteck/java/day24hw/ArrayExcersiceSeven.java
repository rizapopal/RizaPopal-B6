package com.noorteck.java.day24hw;

public class ArrayExcersiceSeven {

public static void main(String[] args) {
		
		int [] a1 = {88, 22 , 6, 1, 2, 3, 88, 22, 44, 33};
		
		int [] a2 = {1, 2, 3, 22, 44, 33};
		
		int [] a3 = {88, 22, 6, 1, 8, 0};
		
		int [] a4 = {2, 3, 88, 22, 44};
		
		int resultOne = getIndexNumber(a1, 3);
		
		int resultTwo = getIndexNumber(a2, 12);
		
		int resultThree = getIndexNumber(a3, 22);
		
		int resultFour = getIndexNumber(a4, 44);
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
		
		System.out.println(resultFour);
		
	} //end of main method
	
	public static int getIndexNumber(int [] number, int elementValue) {
		
		int result = -1;
		
		for(int i = 0; i < number.length; i++) {
			
			if(number[i] != elementValue) {
				
			continue;
			
			
			} else if(number[i] == elementValue) {
				
				result = i;
				
			} 
			
			
		} //end of for loop
	
		
		return result;
		
	} //end of getIndexNumber
	
} //end of class
