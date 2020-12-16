package com.examples.operators;

import java.util.Scanner;

public class GreaterThenEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please Input the number.....");
		int inputNumber = sc.nextInt();
		if(inputNumber >= 1) {
			System.out.println("You have entered number is  " + inputNumber);
		}else {
			System.out.println("You should not enter negative numbers or zero");
		}
	
	}
}
