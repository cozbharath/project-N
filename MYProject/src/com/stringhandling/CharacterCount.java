package com.stringhandling;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (result.indexOf(c) == -1) {
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					if (c == str.charAt(j)) {
						count++;
					}
				}

				System.out.print(c + "" + count);
				result = result + c;
			}
		}

	}

}
