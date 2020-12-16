package com.examples.operators;

import java.util.Scanner;

public class LogicalOperatorOR {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please Input for inputNumber1.....");
		int inputNumber1 = sc.nextInt();
		System.out.println("Please Input for inputNumber2.....");
		int inputNumber2 = sc.nextInt();
		System.out.println("Please Input for inputNumber3.....");
		int inputNumber3 = sc.nextInt();
		
		if(inputNumber1 <= 100 || inputNumber2 <= 100 || inputNumber3 <= 100) {
			System.out.println("You have entered correct value");
		}else {
			System.out.println("Three time you have entered incorrect ");
		}
	}
}
