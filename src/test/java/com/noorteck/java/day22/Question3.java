package com.noorteck.java.day22;

public class Question3 {

	public static void main(String[] args) {
		
		Question3 obj = new Question3();
		
		String strOne  = obj.threeEqual(null, 'P', 'B');
		
		String strTwo = obj.threeEqual("Java Pro", 'P', 'B');
				
		String strThree = obj.threeEqual("Lazy Mode", 'M', 'C');
		
		String strFour = obj.threeEqual("Training", 'T', ' ');
		
		System.out.println(strOne);
		
		System.out.println(strTwo);
		
		System.out.println(strThree);
		
		System.out.println(strFour);
		
	} //end of main method
	
	protected String threeEqual(String strOne, char oldChar, char newChar) {
		
		String newString = "";
		
		if(strOne != null) {
			
		int length = strOne.length();
		int oldIndex = strOne.indexOf(oldChar);
		
		newString = strOne.substring(0, oldIndex) + newChar + strOne.substring(oldIndex + 1, length);
		
		}
		
		else {
			
			newString = null;
		} 
		
		return newString;
	}
	
} //end of class
