package com.noorteck.java.day28hw;

//class cannot be private only public or default
public class TheGrandpa {

	private String country;
	private String city;
	
	
	
	//remove semicolon
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	//remove semicolon; String is capital
	//encapsulation method uses public getters and setters
	public void setCity(String city) {
		this.city = city;
	}
	
	//encapsulation method uses public getters and setters
	public String getCity() {
		return city;
	}
 
	/*
	 * Return type is necessary; add void since we are not returning anything 
	 * Remove semicolon 
	 * add semicolon after first println method
	 * pass values to paramater syntax--> addNum(a, b);
	 * store what addNum method returns and output it
	 */
	
	public void display() {
		
		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		int num = addNum(11, 4);
		System.out.println("11 + 4 = " + num);
	}
	
	/*
	 * remove semicolon after int b
	 * fix spelling of result
	 * change double to int because return type is int
	 * change to public
	 */
	
	public int addNum(int a, int b) {
		
		int result;
		
		result = a+b;
		
		return result;
	}
	
} //end of class