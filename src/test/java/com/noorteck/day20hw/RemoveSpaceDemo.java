package com.noorteck.day20hw;

public class RemoveSpaceDemo {

	public static String removeSpace(String strOne) {
		
		String newString = "";
		
		
		newString = strOne.trim();
		
		return newString;
	}
	
	public static void main(String[] args) {
		
		System.out.println(removeSpace(" Java Training       "));
		
		System.out.println(removeSpace("    I like    to practice          "));
		
		
	}
}
