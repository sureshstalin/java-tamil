package com.example.oops;

public class Student {

	// Member variable or Instance variable
	String name;
	int age;
	String address;

	// Member function or Instance method
	public void setStudent(String studentName, int age, String address) { // "Suresh",45,"Chennai"
		name = studentName;
		this.age = age;
		this.address = address;
	}

	public void getStudent() {

		System.out.println("Name  " + name);
		System.out.println("Age  " + age);
		System.out.println("Address  " + address);
	}
}
