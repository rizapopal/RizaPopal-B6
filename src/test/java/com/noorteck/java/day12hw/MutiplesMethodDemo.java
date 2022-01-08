package com.noorteck.java.day12hw;

public class MutiplesMethodDemo {

	public static void main(String[] args) {
		
		boolean mutipleOf = mutipleOf(3);
		System.out.println(mutipleOf);
		
		mutipleOf = mutipleOf(10);
		System.out.println(mutipleOf);
		
		mutipleOf = mutipleOf(8);
		System.out.println(mutipleOf);
		
	}
	public static boolean mutipleOf(int num) {
		
		boolean mutipleOf = false;
		
		if(!(num < 0) && (num % 3 == 0) || (num % 5 == 0)){
			
			mutipleOf = true;
		}
		
		else {
			
		mutipleOf = false;
		
		}
		
		return mutipleOf;
		
	}
}
