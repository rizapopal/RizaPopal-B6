package com.noorteck.java.day8hw;

public class AverageOfNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		int numOfValues = 0;
		
		for(int a = 20; a <= 30; a++) {
			
			sum = sum + a;
			numOfValues++;
			
		}
		
		int average = sum / numOfValues;
		System.out.println(average);
		
		int b = 20;
		int sum2 = 0;
		int numOfValues2 = 0;
		
		while((b <= 30)) {
			
			sum2 = sum2 + b;
			numOfValues2++;
			b++;
		}
		
		System.out.println(sum2/numOfValues2);
		
		int c = 20;
		int sum3 = 0;
		int numOfValues3 = 0;
		
		do {
			
			sum3 = sum3 + c;
			c++;
			numOfValues3++;
			
		} while( (c <= 30) );
		
		System.out.println(sum3/numOfValues3);
	}
	

}
