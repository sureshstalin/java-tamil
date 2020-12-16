package com.examples.loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int i = 1;
		do { // if i value is lesser than or equal to 5
			System.out.println("Value of i is  " + i);// 1,2,3,4,5
			i++;
		}while (i <= 5);
		System.out.println("do - While loop is ended");
	}
}
