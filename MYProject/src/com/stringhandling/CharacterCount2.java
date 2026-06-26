package com.stringhandling;

import java.util.Scanner;

public class CharacterCount2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		int[] arr = new int[127];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		int max = -1;
		char maxOcc = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				maxOcc = str.charAt(i);
			}
		}

		System.out.println("Maximum Occurring Character : " + maxOcc);
		System.out.println("Count : " + max);

	}

}
