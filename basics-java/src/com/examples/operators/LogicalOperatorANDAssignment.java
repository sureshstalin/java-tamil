package com.examples.operators;

import java.util.Scanner;

public class LogicalOperatorANDAssignment {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please Input the number.....");
		int inputNumber1 = sc.nextInt();
		if(inputNumber1 >= 1  && inputNumber1 <= 100) {
			System.out.println("You have entered correct value " + inputNumber1);
		}else {
			System.out.println("You have entered number is not correct " + inputNumber1);
		}
	}
}
