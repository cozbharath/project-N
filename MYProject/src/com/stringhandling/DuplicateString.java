package com.stringhandling;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (result.indexOf(c) == -1) {
				result = result + c;
			}
		}
		System.out.println(result);
	}

}
