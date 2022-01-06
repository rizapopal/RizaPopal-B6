package com.noorteck.java.day11hw;

public class SleepStatus {

	
	public static void main(String[] args) {
		
		boolean isWeekday = true;
		boolean isVacation = false;
	
		boolean sleepIn = sleepIn(isWeekday, isVacation);
		System.out.println(sleepIn);
		
		isWeekday = false;
		isVacation = false;
		
		sleepIn = sleepIn(isWeekday, isVacation);
		System.out.println(sleepIn);
	
	}
	
	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		
		boolean sleepIn = false;
		
		if(!isWeekday || isVacation) {
			
			sleepIn = true;
		}
		
		else {
			
			sleepIn = false;
		}
		
		return sleepIn;
	}
}
