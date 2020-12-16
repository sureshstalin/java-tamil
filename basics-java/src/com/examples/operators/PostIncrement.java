package com.examples.operators;

public class PostIncrement {

	public static void main(String[] args) {
		
		int a = 30;
		System.out.println("A Before increment " + a);
		// first assign actual value to b variable then increase 1 to a 
		int b = a++; // Post increment operator
		System.out.println("A after increment = " + a);
		System.out.println("B = " + b);
		
		
	}
}
