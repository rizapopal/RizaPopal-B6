package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Question 2: Write a java program to find the first non-repeated character in a String?
 * 
 * Understanding the Question:
 * 
 * 	In "apple", first non-repeated character is 'a'; the second is 'l'; the third is 'e'.
 * 	'p' is the only character repeated.
 * 
 * 	Our method should return 'a'
 * 
 * 	I am assuming case sensitive so 'a' and 'A' are not the same thing
 */

public class Q2NonRepeatedCharacter {

	public static void main(String[] args) {
		
		//test data
		
		char resultOne = firstNonRepeatedChar("apple"); //a
		
		char resultTwo = firstNonRepeatedChar("gamersshouldgame"); //r
		
		char resultThree = firstNonRepeatedChar("Aapple"); //A
		
		System.out.println(resultOne);
		
		System.out.println(resultTwo);
		
		System.out.println(resultThree);
		
		
		
	}
	
	
	/*
	 * PURPOSE: creating a method so we can reuse the function/operation of finding the first non-repeated character in a String
	 * again and again for different Strings
	 * 
	 * This method will return the character that is the first non-repeated character in a String
	 * 
	 * Here's how it should work:
	 *  > it will first loop through all characters of String (we will turn the String to a char array)
	 *  > while looping, it will count the number of times a value is repeated (We can use a map data structure)
	 *  > it will consider all the characters with a one count, but will return the first stored character (Insertion order matters -> LinkedHashMap)
	 */
	
	public static char firstNonRepeatedChar(String str) {
		
		//creating the variable that will store our char that we want to return
		char result = ' ';
		
		//converting our string to an array of characters
		char [] strArray = str.toCharArray();
		
		/*
		 * Our linked hash map is created to take count for our characters and the number of times they occur
		 * It will maintain insertion order, so the first character with a 1 count will be returned (Hopefully)
		 */
		
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();
		
		/*
		 * Loop through our char array and for each element, check if the map has the key
		 * 
		 * 	> if it does then increase the count
		 * 	> if it doesn't then increase the count [value of that character to demonstrate is has repeated again]
		 */
		for(int i = 0; i < strArray.length; i++) {
			
			char c = strArray[i];
					
			if(charMap.containsKey(c)) {
				
				charMap.put(c, charMap.get(c) + 1);
			}
			
			else {
				
				charMap.put(c, 1);
			}
		}
		
		/*
		 * Loop through the entries our map
		 * 
		 * it will break out of the loop once it finds the first character with a count of 1
		 * insertion order is kept for linkedHashMap, so we will not have to worry about knowing what character comes first
		 */
		
		for(Map.Entry<Character, Integer> e: charMap.entrySet()) {
			
			if(e.getValue() == 1) {
				result = e.getKey();
				break;
			}
		}
		
		//returns the char
		return result;
	}
}
