package com.noorteck.java.day22;

public class Question1 {

	public static void main(String[] args) {
		
		Question1 obj = new Question1();
		
		String resultOne = obj.toUpper("Pro");
		
		String resultTwo = obj.toUpper("java");
		
		String resultThree = obj.toUpper(null);
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
				
	} //end of main method
	
	String toUpper(String strOne) {
		
		String newString = "";
		
		if(strOne != null) {
			
		newString = strOne.toUpperCase();
		
		} 
		
		else {
			
			newString = null;
		} 
		
		return newString;
	
	} // end of toUpper method
	
} //end of class
