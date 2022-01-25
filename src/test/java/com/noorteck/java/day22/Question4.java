package com.noorteck.java.day22;

public class Question4 {

	public static void main(String[] args) {
		
		String strOne = getSubStr(null, 2, 6);
		
		String strTwo = getSubStr("java training", 2, 6);
		
		String strThree = getSubStr("Software Development Engineer in TEST", 11, 23);
		
		String strFour = getSubStr("Software Development Engineer in TEST", 21, 29);
		
		System.out.println(strOne);
		
		System.out.println(strTwo);
		
		System.out.println(strThree);
		
		System.out.println(strFour);
		
	}
	
	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		
		String newString = "";
		
		if(str != null && str.length() >= endingIndex) {
			
			newString = str.substring(startingIndex, endingIndex);
		}
		
		else {
			
			newString = null;
		}
		
		return newString;
	}
}

