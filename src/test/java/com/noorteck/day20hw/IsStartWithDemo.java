package com.noorteck.day20hw;

public class IsStartWithDemo {

	
	boolean isStartWith(String strOne, String strTwo) {
	
	boolean result = false;
	
	if(strOne.startsWith(strTwo)) {
		
		result = true;
	}
	
	return result;

	}
	
	public static void main(String[] args) {
		
		IsStartWithDemo obj = new IsStartWithDemo();
		
		boolean resultOne = obj.isStartWith("java training", "ing");
		
		boolean resultTwo = obj.isStartWith("java training", "ja");
		
		boolean resultThree = obj.isStartWith("java training", "java");
		
		boolean resultFour = obj.isStartWith("java training", "train");
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
		
		System.out.println(resultFour);
		
	}
}
