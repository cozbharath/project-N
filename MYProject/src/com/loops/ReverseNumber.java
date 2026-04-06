package com.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int s = sc.nextInt();
		int rev = 0;
		int r = 0;
		int temp = s;
		while (s != 0) {
			r = s % 10;
			s = s / 10;
			rev = rev * 10 + r;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("the given number is palindrome");
		} else {
			System.out.println("the given number is not palindrome");
		}
	}

}
