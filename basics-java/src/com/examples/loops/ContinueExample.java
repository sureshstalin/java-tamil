package com.examples.loops;

public class ContinueExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("This is example of continue keyword " + i);// 1,2
		}
		System.out.println("For loop is completed");
	}
}
