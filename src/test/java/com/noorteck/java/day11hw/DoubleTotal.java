package com.noorteck.java.day11hw;

public class DoubleTotal {

		public static void main(String[] args) {
			
			int myTotal = sumDouble(1, 2);
			System.out.println(myTotal);
			
			myTotal = sumDouble(3,2);
			System.out.println(myTotal);
			
			myTotal = sumDouble(2, 2);
			System.out.println(myTotal);
			
			
			
		
		}
	
	public static int sumDouble(int valueOne, int valueTwo) {
		int total = 0;
		
		if(valueOne != valueTwo) {
			
			total = valueOne + valueTwo;
			
		} else if(valueOne == valueTwo) {
			
			total = 2 * (valueOne + valueTwo);
		}
		
		return total;
	}
}
