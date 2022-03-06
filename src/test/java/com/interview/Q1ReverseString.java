package com.interview;

//write program that reverses given String

public class Q1ReverseString {

	public static void main(String[] args) {

		String str = "Java Program";
		
		//1. convert string to char array
		
		char [] strArray = str.toCharArray();
		 
		//2. create new string object/variable and set value ""
		String newStr = "";
		
		//3. loop thru char array backwards
		for(int i = strArray.length - 1; i >= 0; i--) {
			
			//4. update each character from strArray and newStr
			newStr = newStr + strArray[i];
		}
		
		//5. Print newStr
		System.out.println(newStr);
		
	}
}
