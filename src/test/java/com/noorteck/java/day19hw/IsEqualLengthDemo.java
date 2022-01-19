package com.noorteck.java.day19hw;

public class IsEqualLengthDemo {

	public static void isEqualLength(String strOne, String strTwo) {
		
		if(strOne.length() == strTwo.length()) {
			
			String newString = strOne.concat(strTwo);
			
			System.out.println(newString  + " " + newString.length());
			
			
		} else if(strOne.length() > strTwo.length()) {
			
			String newString = strOne.toUpperCase();
			
			System.out.println(newString + " " + newString.length());
			
		} else if(strOne.length() < strTwo.length()) {
			
			String newString = strTwo.toLowerCase();
			
			System.out.println(newString + " " + newString.length());
		}
		
	}
	
	public static void main(String[] args) {
		
		isEqualLength("Pro", "Ali");
		
		System.out.println("");
		
		isEqualLength("java", "LearNinG");
		
		System.out.println("");
		
		isEqualLength("java training", "java");
	}
	
}
