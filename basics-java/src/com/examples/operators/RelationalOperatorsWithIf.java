package com.examples.operators;

import java.util.Scanner;

public class RelationalOperatorsWithIf {

	// organize import or import the class ctrl + shift + o
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Please enter valid number value.....");
		int inputNumber = sc.nextInt();
		if(inputNumber < 0) { // if(what condition you will going to apply)
			System.out.println("Negative numbers are not allowed here " + inputNumber);
		}else {
			System.out.println("You have entered number is " + inputNumber);
		}
		
		
//		if... else if.... else
		
		
	}
	
}
