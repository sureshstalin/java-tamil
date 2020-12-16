package com.examples.operators;

public class AssignmentOperators3 {

	public static void main(String[] args) {
		
		int a = 10; // Simple Assignment operator
		a += 1; // This is equivalent to a = a + 1; 
		System.out.println("Value of A is  " + a); // 11
		
		int b = 20;
		b -= 1; // This is equivalent to b = b - 1;
		System.out.println("Value of B is  " + b); //19
		
		int c = 30;
		c = c * 2;
		System.out.println("Value of C is  " + c);
		
		int d =  40;
		d = d / 20;
		System.out.println("Value of D is  " + d);
		
		int e = 40;
		e = e % 3;
		System.out.println("Value of E is  " + e);
		
	}
}
