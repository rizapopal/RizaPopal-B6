package com.noorteck.java.day19hw;

public class ToUpperDemo {
	
	
	String toUpper(String strOne) {
		
		String newString = "";
		
		newString = strOne.toUpperCase();
		
		return newString;
	}
	
	
	
	public static void main(String[] args) {
		
		//accessing non static in a static method --> CREATE OBJECT then use objName.methodName()
		
		ToUpperDemo obj = new ToUpperDemo();
		
		System.out.println(obj.toUpper("Pro"));
		
		System.out.println(obj.toUpper("java")); 
		
		System.out.println(obj.toUpper("learning"));
		
		System.out.println(obj.toUpper("java learning"));
		
		
		
	}

}
