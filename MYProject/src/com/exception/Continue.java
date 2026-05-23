package com.exception;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter a number");
				int a = sc.nextInt();

				System.out.println(10 * a);

			} catch (Exception e) {
				System.out.println("Enter a Valid Input ");
				sc.nextLine();
				continue;
			}
		}

	}

}
