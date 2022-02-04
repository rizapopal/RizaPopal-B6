package com.noorteck.java.day28hw;

//to inherit use extends keyword
public class TheSon extends TheDad {

	private char grade;
	static String schoolName;
	//need to initialize final variable always; cannot just declare  
	public final boolean IS_JAVA_FUN = true;
	public final String MY_STATE = "VA";

	/*
	 * remove semicolon
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	/*
	 * You need to return a char for getter method
	 */
	public char getGrade() {
		return grade;
	}
	
	//change to public to use later
	public void trapZone() {
		
		//need to initialize for future use
		char myGrade = 'A';
		
		//need to initialize for future use
		int myFavNumber = 7;	
		System.out.println("My FavNumber" + myFavNumber);
		
		//need to initialize for future use
		String teamName = "Random Team Name";		
		System.out.println("My Team Name: " + teamName);
		
		//static variables are declared outside the class		
		System.out.println("My School Name: "+ schoolName);
		
	
		grade = myGrade;
		System.out.println("My Grade: " + grade);
		
		//declare as an integer
		int age = 12;		
		System.out.println("My age " + age);
		
		//declare as String {literal}
		String country = "USA";	
		System.out.println("Country :" + country);
		
		/*
		 * first off, this variable is boolean to replace it would be true or false
		 * second off, we cannot even replace the value because the final keyword
		 * values of final variables are not allowed to be changed
		 * We can output it if we desire
		 */
		
		//IS_JAVA_FUN = "Yes";
		System.out.println("Is Java Fun? " + IS_JAVA_FUN);
			
	}
	
	 
	public void moreTrap(char grade) {
		//use this keyword to differentiate between instance variable and parameter name
		this.grade = grade;
		
		//you can't change the value of a final variable
		//MY_STATE = "CA";
		
		/*
		 * Set method does not return anything so cannot store it in a variable
		 * remove parameter of getCountry and place it in set method
		 * Same for city and age variables 
		 * 
		 */
		
		setCountry("USA");		
		String country = getCountry();
		
		/*
		 * setCity takes a string parameter
		 */
		setCity("DC");
		String city = getCity();
		
		/*
		 * age takes integer only
		 * we do not pass values to get method
		 */
		setAge(12);
		int age = getAge();
				
		addNum(3,4);
		
		//display method does not take parameters
		display();
		
		trapZone();
		
	}
	 
	
}