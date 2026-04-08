package com.loops;

import java.util.Scanner;

public class LastToNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int s = sc.nextInt();
		while (s >= 1) {
			System.out.print(s + " ");
			s--;
		}
		sc.close();
	}

}
