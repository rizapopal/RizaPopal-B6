package com.noorteck.java.day22;

public class Question5 {

	public static void main(String[] args) {
		
		String strOne = removeSpace(null);
		
		String strTwo = removeSpace("  Java Training  ");
		
		String strThree = removeSpace("      I   like   to  practice      ");
		
		System.out.println(strOne);
		
		System.out.println(strTwo);
		
		System.out.println(strThree);
		
	}
	
	public static String removeSpace(String strOne) {
		
		String newString = "";
		
		if(strOne != null) {
			
			newString = strOne.trim();
			
		}
		
		else {
			
			newString = null;
			
		}
		
		return newString;
		
	}
}
