package com.stringhandling;

import java.util.Scanner;

public class ReverseStringBytes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		byte[] b = str.getBytes();
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print((char) b[i] + " ");
		}
	}

}
