package com.noorteck.day20hw;

public class ConcatStringDemo {

	String concatString(String strOne, String strTwo) {
		
		String newString = "";
		
		newString = strOne.concat(strTwo);
	
		
		int lengthOfOne = strOne.length();
		
		char endChar = newString.charAt(lengthOfOne - 1);
		
		char startChar = newString.charAt(lengthOfOne);
		
		
		
		if(endChar == startChar) {

			
			newString = strOne.substring(0, lengthOfOne).concat(strTwo.substring(1 , strTwo.length()));
			
			
		}
		

		return newString;
		
	}

	public static void main(String[] args) {
		
		
		ConcatStringDemo obj = new ConcatStringDemo();
		
		System.out.println(obj.concatString("food", "door"));
		
		System.out.println(obj.concatString("Java", "awesome"));
		
		System.out.println(obj.concatString("Pro", "ogress"));
	}
}
