package com.noorteck.java.day19hw;

public class IsThereDemo{

	private boolean isThere(String strOne, String value) {
		
		boolean result = false;
		
		if(strOne.contains(value)) {
			
			result = true;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		IsThereDemo obj = new IsThereDemo();
		
		boolean contains = obj.isThere("java training", "ini");
		
		System.out.println(contains);
		
		contains = obj.isThere("java training", "ava");
		
		System.out.println(contains);
		
		contains = obj.isThere("java training", "AVA");
		
		System.out.println(contains);
		
		contains = obj.isThere("java training", "Java");
		
		System.out.println(contains);
				
				
				
		
		
		
	}
	
}
