package com.noorteck.java.day9hw;

public class BrokenCodeTwo {
	
	//string should be capitalized; static comes before void; i removed the spaces between void and main
	public static void main(String[] args) { 
		
		double tempOne = 84.7; //need double data type for decimal values
		int tempTwo = 66;  
		
		boolean result = true; //changed to boolean because it focuses on true/false and I assigned a value
		
		if (tempOne <= 0 && tempTwo >= 100) { //and operator is &&; greater than is >= and less than is <=; removed "" because you do not put values in double quotes
			result = true;
			
		} else if(tempOne >= 100 && tempTwo <= 0) { //syntax is else if; not if else; removed semicolon
													//once again, operator is correct syntax for operator is <=
			result = true;
		} 
		else {
			
			result= false;
		}
		
		System.out.println(result); //case sensitive; variable is result not results
		
		String season = "summer"; //should be a season and lower case since java is case-sensitive

		switch (season) { //cannot use boolean expression for switch statements remove == "phrase" 
		
		case "fall": //no semicolon; just colon; use double quotes for strings
			System.out.println("Recovering from hot weather");
			break;
			
		case "winter":
			System.out.println("Toooo cold");	
			break; //need break statement
			 
		case "spring": //colon no semicolon; use double quotes; should be spring
			System.out.println("Recovering from cold weather");			
			break;
			
		case "summer": //colon not semicolon
			System.out.println("Toooo hot");	
			break; //need break statement		
			 
		default: //colon not semicolon
			System.out.println("Season does not exist!");	
		}
		
		
		for(int i = 0; i <10; i++){ //lower caps for data types and for keyword; need to initialize i; Need semicolons inside for loop; should not have one before curly bracket
			
			if (i == 5){//correct syntax if(boolean expression){}; need == not = =;
				
				System.out.println("i equals to 5"); //need semicolon; change I to i.
				
			} else{ //else does not involve condition; remove ()
				
				System.out.println("i not equals 5; number is: " + i); //need double quotes; added 5 and added the actual number (not needed but it makes more sense)
			}
		}
		
	}	
	
}

//remove three curly brackets because did not open two additional things




