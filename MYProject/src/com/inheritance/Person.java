package com.inheritance;

import java.util.Scanner;

class Person {
	Scanner sc = new Scanner(System.in);

	String name;

	String showPerson() {
		System.out.println("Enter the Name : ");
		name = sc.nextLine();
		return name;

	}
}

class Teacher extends Person {
	String subject;

	String showTeacher() {
		System.out.println("Enter the Subject : ");
		subject = sc.nextLine();
		return subject;
	}

}

class MathTeacher extends Teacher {
	String experience;

	String showMathTeacher() {
		System.out.println("Enter the Years of Experience : ");
		experience = sc.nextLine();
		return experience;

	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Subject : " + subject);
		System.out.println("Math Teacher : " + experience);
	}
}
