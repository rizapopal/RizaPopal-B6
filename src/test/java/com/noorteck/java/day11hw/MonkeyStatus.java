package com.noorteck.java.day11hw;

public class MonkeyStatus {
	
	public static void main(String[] args) {
		
		boolean areWeInTrouble = false;
		
		areWeInTrouble = monkeyTrouble(true, true);
		
		System.out.println("Are we in trouble? "+ areWeInTrouble);
		
		areWeInTrouble = monkeyTrouble(true, false);
		
		System.out.println("Are we in trouble? "+ areWeInTrouble);
		
		areWeInTrouble = monkeyTrouble(false, false);
		
		System.out.println("Are we in trouble? "+ areWeInTrouble);
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		
		boolean inTrouble = false;
		
		if((aSmile && bSmile) || (!aSmile && !bSmile)) {
			
			inTrouble = true;
		}
		else {
			
			inTrouble = false;
		}
		return inTrouble;
	}
}
