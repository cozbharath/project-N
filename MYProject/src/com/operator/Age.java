package com.operator;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");

		while (true) {
			int age = sc.nextInt();

			if (age == -1) {
				System.out.println("Program Ended");
				break;
			}

		if (age >= 60) {
			System.out.println("Old Age");
		} else if (age >= 36 && age <= 59) {
			System.out.println("Middle Age");
		} else if (age >= 20 && age <= 35) {
			System.out.println("Young Age");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Teen Age");
		} else if (age >= 6 && age <= 12) {
			System.out.println("Kid");
		} else {
			System.out.println("Child");
		}
		}
	}

}
