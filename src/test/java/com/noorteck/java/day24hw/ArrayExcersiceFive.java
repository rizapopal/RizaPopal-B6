package com.noorteck.java.day24hw;

public class ArrayExcersiceFive {

public static void main(String[] args) {
		
		ArrayExcersiceFive obj = new ArrayExcersiceFive();
		
		int [] a1 = {6, 1, 2, 3};
		
		int [] a2 = {13, 3};
		
		int [] a3 = {0, 1, 4};
		
		int [] a4 = {6};
		
		int [] arrayResultOne = obj.getDouble(a1);
		
		int [] arrayResultTwo = obj.getDouble(a2);
		
		int [] arrayResultThree = obj.getDouble(a3);
		
		int [] arrayResultFour = obj.getDouble(a4);
		
/**
 *  
 *
 I knew sysout.print() exists so I used that to get [x. y, z] format
 *  But I do not understand it when combined with sysout.println
 *  
 */	
		
		//outputs arrayResultOne
		
		for(int i = 0; i < arrayResultOne.length; i++) {
			
			if(i == 0) {
				System.out.print("[");
				
			} 
			
			if(arrayResultOne[i] == 0) {
				
				System.out.print(arrayResultOne[i] + ",");
				
			} else if(i == arrayResultOne.length -1){
				
				System.out.print(arrayResultOne[i] + "]");
				
			}
			
		} //end of outputting arrayResultOne
		
		System.out.println("");
		
		//outputs arrayResultTwo
		
		for(int i = 0; i < arrayResultTwo.length; i++) {
			
			if(i == 0) {
				
				System.out.print("[");
				
			}
			
			if(arrayResultTwo[i] == 0) {
				
				System.out.print(arrayResultTwo[i] + ",");
				
			} else if(i == arrayResultTwo.length - 1) {
				
				System.out.print(arrayResultTwo[i] + "]");
			}
		} //end of outputting arrayResultTwo
		
		System.out.println("");
		
		//outputs arrayResultTwo
		
		for(int i = 0; i < arrayResultThree.length; i++) {
			
			if(i == 0) {
				
				System.out.print("[");
				
			}
			
			if(arrayResultThree[i] == 0) {
				
				System.out.print(arrayResultThree[i] + ",");
				
			} else if(i == arrayResultThree.length - 1) {
				
				System.out.print(arrayResultThree[i] + "]");
			}
		} //end of outputting arrayResultThree
		
		System.out.println("");
		
		//outputs arrayResultFour
		
		for(int i = 0; i < arrayResultFour.length; i++) {
			
			if(i == 0) {
				
				System.out.print("[");
				
			} 
			
			if(arrayResultFour[i] == 0) {
				
				System.out.print(arrayResultFour[i] + ",");
				
			} else if(i == arrayResultFour.length - 1) {
				
				System.out.print(arrayResultFour[i] + "]");
			}
		} //end of outputting arrayResultFour
		
		
		
		
		
	} //end of main method
	
	private int [] getDouble(int [] number) {
		
		int result [] = new int [2 * number.length];
		
		int newLastElement = result.length - 1;
		
		for(int i = 0; i < result.length; i++) {
			
			result [i] = 0;
			
			if(i == newLastElement) {
				
				result[newLastElement] = number[number.length - 1];
				
			}
			
		}
		
		return result;
	} //end of getDouble method
	
} //end of class
