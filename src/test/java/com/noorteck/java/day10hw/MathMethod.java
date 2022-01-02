package com.noorteck.java.day10hw;

public class MathMethod {

	public static void main(String[] args) {
		
		calculate(10, 5, '+');
		
		calculate(10, 5, '-');
		
		calculate(10, 5, '*');
		
		calculate(10, 5, '/');
		
		calculate(10, 5, '%');
		
		calculate(10, 5, 'S');
	
		
	}
	
	public static void calculate(double numOne, double numTwo, char mathOperatorSign) {
		
		if(mathOperatorSign == '+') {
			
			System.out.println(numOne + " " + mathOperatorSign + " " + numTwo + " = " + (numOne + numTwo));
			
		} else if(mathOperatorSign == '-') {
			
			System.out.println(numOne + " " + mathOperatorSign + " " + numTwo + " = " + (numOne - numTwo));
			
		} else if(mathOperatorSign == '*') {
			
			System.out.println(numOne + " " + mathOperatorSign + " " + numTwo + " = " + (numOne * numTwo));
			
		} else if(mathOperatorSign == '/') {
			
			System.out.println(numOne + " " + mathOperatorSign + " " + numTwo + " = " + (numOne / numTwo));
			
		} else if(mathOperatorSign == '%') {
			
			System.out.println(numOne + " " + mathOperatorSign + " " + numTwo + " = " + (numOne % numTwo));
		}
		
		else {
			System.out.println("Error! Invalid math operator sign");
		}
		
	}
	
}

