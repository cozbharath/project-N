package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name");
		String name = sc.nextLine();

		System.out.println("Enter the Age ");
		int age = sc.nextInt();

		System.out.println("Enter the total Marks ");
		int marks = sc.nextInt();

		System.out.println("Enter total Subjects ");
		int sun = sc.nextInt();

		int[] arr = { 10, 20, 30, 40 };

		int user = sc.nextInt();

		try {
			System.out.println(name.length());
			System.out.println(age);

			System.out.println(marks / sun);

			System.out.println("Enter the Position " + arr[user]);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
