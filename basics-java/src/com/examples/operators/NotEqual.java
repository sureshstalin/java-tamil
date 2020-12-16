package com.examples.operators;

import java.util.Scanner;

public class NotEqual {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please enter valid number value.....");
		int inputNumber = sc.nextInt();
		
		if(inputNumber != 0) {
			System.out.println("The entered number is  " + inputNumber);
		}else {
			System.out.println("Zero is not valid");
		}
	}
}
