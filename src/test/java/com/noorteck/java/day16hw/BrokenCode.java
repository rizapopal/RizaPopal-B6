package com.noorteck.java.day16hw;

public class BrokenCode {

	
public static void main(String[] args) { //main method spelled wrong
		
		double addResult = addTwoNumbers(2, 4); //this method has two int parameters so you must only pass two int values
		
		System.out.println(addResult);
		
				//boolean expression; you are comparing so use == not =
		for(int i = 0; i == 10; i++) { //use assignment operator =; not compare equal operator; use semi colons in between except after update and ()
			
			System.out.println("Count " + " = " + i); //System.out.println; I corrected format is
			
		}
		
		//only use one int value
		whoseFavNumber(23); 
		whoseFavNumber(3); //add ;		
		whoseFavNumber(1); //remove .
		
		String name = "John Cena";
		myName(name); //needs a string variable inside not "John Cena"; you cannot store it inside a String variable because it wont return a string
		//call on method
		
	}

	
	//Need to write methods outside of other methods; methods need to be written inside a class
	public static void myName(String name) {
		
	System.out.println("My name is " + name);
	
	}
	
	//public static first; need return type int not void 
	public static int addTwoNumbers(int numOne, int numTwo) { //commas must seperate parameters and no colon or semicolon after () of method

		int result = numOne + numTwo;

		System.out.println(numOne + " + " + numTwo + " = " + result);
		
		return result;
	}
	
	public static String whoseFavNumber(int i){ //we do not assign values inside parameters
		
		String result = ""; //change to string and give a default value
		
		if ( i == 1) { //no semicolons for if else syntax; use ==
			
			result = "Brook"; //use "" and semicolon; added a }
			
		} else if ( i == 2 || i == 4 && i == 4) {  //use == else if format goes after }
			
			result = "Dannia"; //result and use "" and then semicolon
					
		} else if (i == 3) { //i == 3; else if //remove ; and add {
		
			result = "Helen";
			
		}  
		
		else { //else syntax: else{}
		
			result = "my favorite number"; // String syntax is "phrase";
		
		}
		
		//need to return result
		return result;
	//} //remove
	}
}
