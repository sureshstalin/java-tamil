package com.examples.operators;

public class PreIncrement {

	public static void main(String[] args) {
		
		int a = 30;
		System.out.println("A Before increment " + a);
		/*
		 * first increase the value of the a variable to 1 then then assign the a
		 * variable value to b
		 */
		int b = --a; // Post increment operator
		System.out.println("A after increment = " + a);
		System.out.println("B = " + b);
		
		
	}
}
