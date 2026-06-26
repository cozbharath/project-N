package com.stringhandling;

import java.util.Scanner;

public class DuplicatePrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) != str.lastIndexOf(c) && result.indexOf(c) == -1) {
				System.out.println(c);
				result = result + c;
			}
		}
	}

}
