package com.examples.operators;

import java.util.Scanner;

public class LogicalOperatorNOT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Input the number.....");
		int inputNumber = sc.nextInt(); // 0
		System.out.println(inputNumber == 0); //false
		if (!(inputNumber == 0)) {  // true
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
	}
}
