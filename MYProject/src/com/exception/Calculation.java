package com.exception;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter a value : ");
		int a = sc.nextInt();

		System.out.println("Enter b Value : ");
		int b = sc.nextInt();

//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.exception.Calculation.main(Calculation.java:16)
		try {
			System.out.println(a / b);
		} catch (RuntimeException e) {
			System.err.println("Zeros are not valid in this expression" + e);
		}
		System.out.println("Hi");
	}

}
