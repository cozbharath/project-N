package com.loops;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");

		int n = sc.nextInt();
		int r = 0;
		int rev = 0;
		int temp = 0;
		int count = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
			count++;
		}
		System.out.println("The reverse Number is: " + rev);
		System.out.println(count);
		
		temp = n;
		if (temp == rev) {
			System.out.println("the given Number is Palindrome");
		} else {
			System.out.println("the given Number is not Palindrome");
		}
		sc.close();
	}

}
