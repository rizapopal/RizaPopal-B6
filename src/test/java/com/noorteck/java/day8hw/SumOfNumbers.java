package com.noorteck.java.day8hw;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		//For-Loop Sum of Even & Odd Numbers
		int totalOdd = 0;
		int totalEven = 0;
	
		for(int a = 1; a <= 20; a++) {
			
			
			if(a % 2 == 0) {
				
				totalEven++;
			}
			
			else {
				totalOdd++;
			}

		}
		
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for(int b = 1; b <= 20; b++) {
			
			
			if(b % 2 == 0) {
				
				sumOfEven = sumOfEven + b;
				
			}
			
			else {
				sumOfOdd = sumOfOdd + b;
				
			}

		}
		
		System.out.println("Total even numbers: "+ totalEven);
		System.out.println("Total odd numbers: "+ totalOdd);
		System.out.println("---------------------------------------");
		
		System.out.println("Sum of even numbers: "+ sumOfEven);
		System.out.println("Sum of odd numbers: "+ sumOfOdd);
		System.out.println("---------------------------------------");
		
		
		//while loop
		int num = 1;
		int sumOfEven2 = 0;
		int sumOfOdd2 = 0;
		
		while(num <= 20) {
			
			if(num % 2 == 0) {
				
				sumOfEven2 = sumOfEven2 + num;
				
			}
			
			else {
				sumOfOdd2 = sumOfOdd2 + num;
				
			}
			
			num++;
			
		}
		
		System.out.println("Sum of even numbers: "+ sumOfEven2);
		System.out.println("Sum of odd numbers: "+ sumOfOdd2);
		System.out.println("---------------------------------------");
		
		
		int num2 = 1;
		int sumOfEven3 = 0;
		int sumOfOdd3 = 0;
		
		do {
			
			if(num2 % 2 == 0) {
				
				sumOfEven3 = sumOfEven3 + num2;
				
			}
			
			else {
				sumOfOdd3 = sumOfOdd3 + num2;
				
			}
			
			num2++;
			
		}while(num2 <= 20);
		
		System.out.println("Sum of even numbers: "+ sumOfEven3);
		System.out.println("Sum of odd numbers: "+ sumOfOdd3);
		
		
		
		
		
	}
}
