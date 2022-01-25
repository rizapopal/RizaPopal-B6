package com.noorteck.java.day22;

public class Question6 {

	public static void main(String[] args) {
		
		Question6 obj = new Question6();
		
		boolean resultOne = obj.endsWithNG(null);
		
		boolean resultTwo = obj.endsWithNG("I like to practice");
		
		boolean resultThree = obj.endsWithNG("Everyone is practicing");
		
		boolean resultFour = obj.endsWithNG("I am studying");
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
		
		System.out.println(resultFour);
		
	}
	
	public boolean endsWithNG(String strOne) {
		
		boolean result = false;
		
		String endStr = "ng";
		
		if(strOne != null && strOne.length() >= 2) {
			
			result = strOne.endsWith(endStr);
		}
		
		
		return result;
	}
	
}
