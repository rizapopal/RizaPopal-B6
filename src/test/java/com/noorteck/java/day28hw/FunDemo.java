package com.noorteck.java.day28hw;

public class FunDemo {
	
	public static void main(String[] args) {
		
		//The Grandpa Object	
		TheGrandpa grandpaObj = new TheGrandpa();
		/*
		 * private variables only accessed by get and set methods
		 * add()
		 * remove redundant code or change country value
		 */
		
		grandpaObj.setCountry("USA");
		
		//grandpaObj.setCountry("USA");	
		
		System.out.println(grandpaObj.getCountry());
		
		/*
		 * display method does not take parameters so remove value
		 */
		grandpaObj.addNum(2,5);
		grandpaObj.display();
		
		/*
		 * Grandpa class does not inherit from Dad it only works one way
		 * So cannot do this; remove
		 */
		
		//grandpaObj.setAge(66);
		//System.out.println(grandPaObj.getAge());
		
	 
		
		//TheDad object
		
		/*
		 * we do not have a parameterized constructor in the dad class
		 * so we cannot pass value to constructor
		 * we can allow java to initialize the object with default values
		 * to do this remove passed string and let java handle it
		 */
		TheDad dadObj = new TheDad();
		
		/*
		 * Age can only be accessed by getter and setter methods because its private variable
		 * get method will return integer value not set method; remove passed value
		 */
		dadObj.setAge(12);
		
		int theAge = dadObj.getAge();
		
		//remove "true" we do not pass values to get method
		System.out.println(dadObj.getAge());
		
		//we do not have this method maybe use randomNum
		//int result = dadObj.favNumWho(7);
		dadObj.randomNum();
		
		/*
		 * set country first
		 * then store using get method
		 */
		dadObj.setCountry("Canada");
		System.out.println(dadObj.getCountry());
		
		
		//TheSon object 
		
		/*
		 * we do not have a parameterized constructor in the son class
		 * so we cannot pass value to constructor
		 * we can allow java to initialize the object with default values
		 * to do this remove passed string and let java handle it
		 */
		TheSon sonObj = new TheSon();
		
		//takes char not string
		sonObj.setGrade('A');
		
		/*
		 * do not pass anything to get method
		 * change string to char
		 * remove )
		 */
		
		char resultGrade = sonObj.getGrade();
		System.out.println(resultGrade);
		
		sonObj.addNum(3, 5);
		
		//you setCity is a method that we pass values to parameters
		sonObj.setCity("Reston");
		
		//add () after get method
		System.out.println(sonObj.getCity());
		
		sonObj.trapZone();
		
		/*
		 * moreTrap does not return anything so you cannot
		 * store it in a variable
		 * remove String values because it is char
		 */
		sonObj.moreTrap('A');
		
		System.out.println("Yes :)");
	}

}