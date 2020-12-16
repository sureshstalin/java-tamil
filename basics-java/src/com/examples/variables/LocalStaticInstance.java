package com.examples.variables;

public class LocalStaticInstance {

	static String employeeName = "Suresh Stalin"; // Static variable
	int y = 10;//

	public static void show() {
		int a = 30; // local variable
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		int x = 40;
		LocalStaticInstance.show();
		System.out.println(x);
		System.out.println(LocalStaticInstance.employeeName);
	}
}
