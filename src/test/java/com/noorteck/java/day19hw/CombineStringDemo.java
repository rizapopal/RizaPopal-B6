package com.noorteck.java.day19hw;

public class CombineStringDemo {

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		
		String newString = "";
		
		newString = strOne.toUpperCase().concat(strTwo.toLowerCase()).concat(strThree.toUpperCase()).concat(strFour.toLowerCase());
		
		return newString;
	}
	
	public static void main(String[] args) {
		
		String newString = combineStr("day", "ONE", "work", "HOURS");
		
		System.out.println(newString);
		
		newString = combineStr("week", "weekend", "monday","Tuesday");
		
		System.out.println(newString);
		
		newString = combineStr("restoN", "vA", "baltiMORE", "MD");
		
		System.out.println(newString);
		
		newString = combineStr("java", "is", "fun" , "LEARNING");
		
		System.out.println(newString);
				
		
	}
}
