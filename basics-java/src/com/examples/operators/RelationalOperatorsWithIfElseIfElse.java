package com.examples.operators;

import java.util.Scanner;

public class RelationalOperatorsWithIfElseIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter valid number value.....");
		int inputNumber = sc.nextInt();
		if (inputNumber < 0) { // if(The condition you will going to apply)
			System.out.println("Negative numbers are not allowed here " + inputNumber);
		
		}else if(inputNumber == 0) { // else if(The condition you will going to apply){
			
			System.out.println("Zero is not allowed");
		
		}else {
			System.out.println("You have entered number is " + inputNumber);
		}
	}

}
