package com.noorteck.java.day10hw;

public class MaxMinNumberMethod {
	
	public static void main(String[] args) {
		
		getDoWhileLoopResult(1, 10);
	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {
		
		do {
			
			System.out.println(minNum);
			minNum++;
			
		} while(minNum <= maxNum);
	}
}
