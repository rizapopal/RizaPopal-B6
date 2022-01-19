package com.noorteck.java.day19hw;

public class HelloToDemo {

	String helloTo(String name) {
		
		String newString = "";
		
		newString = "Hello" + " " + name;
		
		return newString;
	}
	
	public static void main(String[] args) {
		
		HelloToDemo name = new HelloToDemo();
		
		System.out.println(name.helloTo("Dennis"));
		
		System.out.println(name.helloTo("Malek"));
		
		System.out.println(name.helloTo("Sara"));
		
		
		
	}
}
