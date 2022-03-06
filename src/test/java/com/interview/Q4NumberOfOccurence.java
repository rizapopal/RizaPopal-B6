package com.interview;

import java.util.HashMap;

//4. write program to count number of occurrences of each character in String

public class Q4NumberOfOccurence {

	public static void main(String[] args) {
		
		String str = "JavaProgram";
		
		//1. convert string to char [] using toCharArray()
		char [] strArray = str.toCharArray();
		
		/*
		 * create HashMap object
		 * key
		 * 		>characters in string
		 * value
		 * 		>count/#of occurrence of character
		 */
		
		HashMap<Character, Integer> strMap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < strArray.length; i++) {
			
			char key = strArray[i];
			
			if(!strMap.containsKey(key)) {
				strMap.put(key, 1);
			}
			
			else {
				int value = strMap.get(key);
				
				int updatedValue = value + 1;
				
				strMap.put(key, updatedValue);
			}
			
		}
		
		System.out.println(strMap);
		
	}
}
