package com.noorteck.day20hw;

public class GetSubStrDemo {

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		
		String newString =  "";
		
		newString = str.substring(startingIndex, endingIndex);
		
		return newString;
	}
	
	public static void main(String[] args) {
		
		String strOne = getSubStr("java training", 2, 6);
		
		String strTwo = getSubStr("Software Development Engineer in TEST", 11, 23);
		
		String strThree = getSubStr("Software Development Engineer in TEST", 21, 29);
		
		System.out.println(strOne);
		
		System.out.println(strTwo);
		
		System.out.println(strThree);
	}
}
