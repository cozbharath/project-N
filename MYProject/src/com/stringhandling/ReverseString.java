package com.stringhandling;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {
			rev = s1.charAt(i) + rev;
		}
		System.out.println(rev);

		if (rev.equalsIgnoreCase(s1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}

}
