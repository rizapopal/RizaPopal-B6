package com.noorteck.java.day22;

public class Question2 {

	public static void main(String[] args) {
		
		Question2 obj = new Question2();
			
		boolean resultOne = obj.isEndWith("java training", "ing");
		
		boolean resultTwo = obj.isEndWith("java training", "ng");
		
		boolean resultThree = obj.isEndWith("java training", "java");
		
		boolean resultFour = obj.isEndWith("java training", "train");
		
		boolean resultFive = obj.isEndWith(null, "java");
		
		boolean resultSix = obj.isEndWith(null, null);
		
		boolean resultSeven = obj.isEndWith("aaabc", "abc");
		
		boolean resultEight = obj.isEndWith("abc", null);
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
		
		System.out.println(resultFour);

		System.out.println(resultFive);
		
		System.out.println(resultSix);
		
		System.out.println(resultSeven);
		
		System.out.println(resultEight);
		
	} //end of main method
	
	boolean isEndWith(String strOne, String strTwo) {
		
		boolean result = false;
		
		if(strOne != null && strTwo != null) {
			
			result = strOne.endsWith(strTwo);
		}
		
		return result;
		
	} //end of isEndWith Method
	
} //end of class
