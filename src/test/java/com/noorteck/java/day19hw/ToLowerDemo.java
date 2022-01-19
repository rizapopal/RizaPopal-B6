package com.noorteck.java.day19hw;

public class ToLowerDemo {

	protected String toLower(String strOne) {
		
		String newString = "";
		
		newString = strOne.toLowerCase();
		
		return newString;
	}
	
	public static void main(String[] args) {
		
		ToLowerDemo obj = new ToLowerDemo();
		
		System.out.println(obj.toLower("espn"));
		
		System.out.println(obj.toLower("ESPN"));
		
		System.out.println(obj.toLower("SOCCER"));
		
		System.out.println(obj.toLower("STRING CLASS"));
	}
}
