package com.examples.loops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 3; i++) { // outer loop
			 System.out.println("This is outer for loop " + i); //0,1,2
			 for(int j = 0; j < 3; j++) { // inner loop
				 System.out.println("This is inner for loop " + j); //0,1,2|0,1,2|0,1,2
			 }
		}
		System.out.println("Nested For loop is completed");
	}
}
