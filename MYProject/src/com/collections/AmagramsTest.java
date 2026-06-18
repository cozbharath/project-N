package com.collections;

import java.util.Arrays;
import java.util.Scanner;

public class AmagramsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str1 = sc.next().toLowerCase();

		System.out.println("Enter the Second String : ");
		String str2 = sc.next().toLowerCase();

		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
