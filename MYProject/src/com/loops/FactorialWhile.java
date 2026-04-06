package com.loops;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int s = sc.nextInt();
		while (s >= 1) {
			fact = fact * s;
			s--;
		}
		System.out.println(fact);

	}

}
