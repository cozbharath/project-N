package com.exception;

import java.util.Scanner;

public class ArratIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 20, 30, 40, 50, 60 };

		while (true) {

			try {
				System.out.println("Enter the Position 0-4 :");
				int user = sc.nextInt();
				System.out.println("Enter A number : ");
				int num = sc.nextInt();
				System.out.println(arr[user] / num);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Position not found");
			} catch (ArithmeticException e) {
				System.out.println("Zeroes Are not Valid, Not divisible by any Number");
			}
			
			sc.close();
		}
	}

}
