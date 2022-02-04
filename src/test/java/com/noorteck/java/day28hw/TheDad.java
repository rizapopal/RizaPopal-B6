package com.noorteck.java.day28hw;

//extends not extend
public class TheDad extends TheGrandpa {

	private int age;

	/*
	 * java cannot differentiate between parameter and and instance variable
	 */
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * need to return a integer value
	 * get method are not setting anything
	 */
	
	public int getAge() {
		//age = age;
		return age;
	}

	/*
	 * Can only pass integer values to an integer array; remove the incorrect values
	 * an array literal uses {} brackets after the assignment operator
	 */
	
	public void randomNum() {
		int number [] = {1,43,65,8,67,23,98,12,12,45,7,0,99,34,11,54};
		
		
		/*
		 * declare i to be an integer
		 * use brackets and inside place i to access the element not ()
		 * remove semicolon after for()
		 */
		for(int i = 0; i < number.length; i++) {
			
			System.out.println(number[i]);
			
		}	
	}
	
	
}