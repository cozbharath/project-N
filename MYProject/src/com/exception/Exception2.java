package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter Name");
			String name = sc.nextLine();

			System.out.println("Enter Age");
			int age = sc.nextInt();

			System.out.println("Enter Total Marks");
			int marks = sc.nextInt();

			System.out.println("Enter Total Subjects");
			int sub = sc.nextInt();

			int[] arr = { 10, 20, 30, 40 };

			System.out.println("Enter Array Index");
			int user = sc.nextInt();

			System.out.println("Name Length = " + name.length());
			System.out.println("Age = " + age);
			System.out.println("Average Marks = " + (marks / sub));
			System.out.println("Array Element = " + arr[user]);
		} catch (NullPointerException e) {
			System.out.println("Null Values are not accepted");

		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter numbers where required.");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index.");
		} finally {
			sc.close();
		}
	}

}
