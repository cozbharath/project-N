package com.method;

import java.util.Scanner;

public class Operators1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number");
		
		int x = sc.nextInt();

		if ((x & 1) == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
