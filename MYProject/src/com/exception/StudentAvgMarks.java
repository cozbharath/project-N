package com.exception;

import java.util.Scanner;

public class StudentAvgMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total Marks of Student : ");
		int marks = sc.nextInt();

		System.out.println("Enter the no of Subjects have : ");
		int subjects = sc.nextInt();
		try {
			System.out.println("Average Marks of a Student is : " + marks / subjects);
		} catch (ArithmeticException e) {
			System.err.println("Zeroes are Invalid : ");
		}
	}

}
