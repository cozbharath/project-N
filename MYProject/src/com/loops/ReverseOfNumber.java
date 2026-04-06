package com.loops;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int r = 0;
		int rev = 0;
		int temp = num;
		for (; num != 0; num = num / 10) {
			r = num % 10;
			rev = rev * 10 + r;
		}
		if(temp == rev) {
			System.out.println("The Given Number is Palindrome");
		} else {
			System.out.println("The Given Number is not Palindrome");
		}
		System.out.println(rev);
	}

}
