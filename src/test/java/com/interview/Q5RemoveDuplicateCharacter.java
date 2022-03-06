package com.interview;

/*
 * 5. Wrote a java program to remove duplicate character from String?
 * 
 * 	dad --> a
 * 	ddiibb -> dib
 */

import java.util.LinkedHashSet;

public class Q5RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		removeDuplicate("dad"); //a
		
		removeDuplicate("ddiibb"); //dib
	}
	
	/*
	 * I am creating a function/method to remove the duplicate character
	 * This method is case sensitive meaning 'a' and 'A' are different characters.
	 */
	
	public static void removeDuplicate(String str) {
	
		//I am turning the passed string to an array of characters
		char [] strArray = str.toCharArray();
		
		/*
		 * I am creating a linked hash map:
		 * >keeps insertion order
		 * >unique characterCharacters*/
		
		LinkedHashSet<Character> charLinkedHashSet = new LinkedHashSet<>();
		
		/*
		 * I need to loop through array (forward) and add our characters to our linked hash set
		 * 
		 * I am using a for loop so that I can keep track of index and I know the number of times I want to loop
		 * [till the last index of the array]
		 */
		
		for(int i = 0; i < strArray.length; i++) {
			
			/*
			 * I am storing the current iteration character in a char variable called key 
			 */
			char character = strArray[i];
			
			/*
			 * duplicate values will be overwritten and insertion order wil, 
			 * so no need for anymore logic on my part
			 */
			
			charLinkedHashSet.add(character);
		
		}
		
		System.out.println(charLinkedHashSet);
	}
}
