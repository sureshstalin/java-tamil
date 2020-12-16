package com.examples.operators;

import java.util.Scanner;

public class GreaterThan {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please enter valid number value.....");
		int inputNumber = sc.nextInt();
		
		if(inputNumber > 100) {
			System.out.println("Please enter the number less then 100");
		}else {
			System.out.println("Entered value is " + inputNumber);
		}
	}
}
