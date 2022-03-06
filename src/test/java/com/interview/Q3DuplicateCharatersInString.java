package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Question 3: Write a java program to find the duplicate characters in a string?
 * 
 * Case sensitive approach: 'A' and 'a' are different characters
 */

public class Q3DuplicateCharatersInString {

	public static void main(String[] args) {
		
		duplicateCharacters("apple");
		
		duplicateCharacters("bad is bad");
		
		
	}
	
	/*
	 * method that takes in a string as parameter
	 * 	>static so we do not have to create object in main method
	 * 	>void so we don't have to store our results like in question 2
	 */
	
	public static void duplicateCharacters(String str) {
		
		//convert string to array of characters
		char [] strArray = str.toCharArray();
		
		//creating hash map so we can keep track of characters and the number of times they appear
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		/*
		 * Loops through the array and adds entries to our hash map and will update the count/value 
		 * every time when that character is repeated 
		 */
		for(int i = 0; i < strArray.length; i++) {
			
			char key = strArray[i];
			
			if(charMap.containsKey(key)) {
				
				charMap.put(key, charMap.get(key) + 1);
			}
			
			else {
				
				charMap.put(key, 1);
			}
		}
		 
		/*
		 * creating a dynamic array (ArrayList) so that no matter how many characters, we can see the duplicate characters
		 * in an "array format"
		 */
		
		ArrayList<Character> charArrayList = new ArrayList<>();
		
		/*
		 * Loops through the entries of our hash map and will store the characters that have duplicates in the array list
		 */
		for(Map.Entry<Character, Integer> entry: charMap.entrySet()) {
			
			if(entry.getValue() == 2) {
				charArrayList.add(entry.getKey());
			}
		}
		
		System.out.println("The duplicate characters in the phrase <" + str + "> are: " + charArrayList);
	}
}
