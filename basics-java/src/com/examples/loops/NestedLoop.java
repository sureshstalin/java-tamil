package com.examples.loops;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Value of i is  " + i);
			for(int j = 1; j <= 2; j++) {
				System.out.println("Value of j is  " + i);
			}
		}
	}
	
}
