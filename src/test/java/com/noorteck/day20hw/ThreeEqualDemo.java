package com.noorteck.day20hw;

public class ThreeEqualDemo {

	protected String threeEqual(String str, char oldChar, char newChar) {
		
		String newString = "";
		
		//replace char A with char B inside of whole string STR
		
		int index = str.indexOf(oldChar);
		
		newString = str.substring(0, index) + newChar + str.substring(index + 1, str.length());
		
		
		
		return newString;
	}
	
	public static void main(String[] args) {
		
		ThreeEqualDemo obj = new ThreeEqualDemo();
		
		String resultOne = obj.threeEqual("Java Pro", 'P', 'B');
		
		String resultTwo = obj.threeEqual("Lazy mode", 'm', 'C');;
		
		String resultThree = obj.threeEqual("Training", 'T', ' ');;
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
	}
}
