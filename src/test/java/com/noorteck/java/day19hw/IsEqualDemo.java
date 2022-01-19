package com.noorteck.java.day19hw;

public class IsEqualDemo {

	static boolean isEqual(String strOne, String strTwo) {
		
		boolean result = false;
		
		if(strOne.equals(strTwo)) {
			
			result = true;
		}
		
		else {
			
			result = false;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		boolean areStringsEqual = isEqual("sdet", "SDET");
		
		System.out.println(areStringsEqual);
		
		areStringsEqual = isEqual("testing", "testing");
		
		System.out.println(areStringsEqual);
		
		areStringsEqual = isEqual("java", "java");
		
		System.out.println(areStringsEqual);
		
		areStringsEqual = isEqual("java", "Java Programming");
		
		System.out.println(areStringsEqual);
		
	}
}
