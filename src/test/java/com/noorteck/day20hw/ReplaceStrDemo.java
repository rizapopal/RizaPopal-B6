package com.noorteck.day20hw;

public class ReplaceStrDemo {

	
	public static void replaceStr(String strOne, String oldStr, String newStr) {
	
		/**
		 
		int index = strOne.indexOf(oldStr);
		
		strOne = strOne.substring(0, index).concat(newStr).concat(strOne.substring(index + oldStr.length(), strOne.length()));
		
		System.out.println(strOne);
		
		
		*/
		
		//We never learned the replace method in class; someone said it was in the power point
		//I did both ways in case we were not suppose to use replace method
		
		strOne = strOne.replace(oldStr, newStr);
		
		System.out.println(strOne);
	}
	
	public static void main(String[] args) {
		
		replaceStr("I cannot do it", "cannot", "can");
		
		replaceStr("Tomorrow is my day", "Tomorrow", "Today");
	}
}
