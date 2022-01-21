package com.noorteck.day20hw;

public class GetCharacterDemo {

	public static char getCharacter(String strOne, int indexNum) {
		
		char result = ' ';
		
		if(indexNum > strOne.length()) {
			
			result = '?';
		}
		
		else {
			
			result = strOne.charAt(indexNum);
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		
		char resultOne = getCharacter("java training", 2); 
		
		System.out.println(resultOne);
		
		char resultTwo = getCharacter("java training", 5);
		
		System.out.println(resultTwo);
		
		char resultThree = getCharacter("java training", 8);
		
		System.out.println(resultThree);
		
		char resultFour = getCharacter("java training", 22);
		
		System.out.println(resultFour);
	}
	
}
