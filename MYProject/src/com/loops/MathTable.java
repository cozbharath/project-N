package com.loops;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		System.out.println("Enter a Number : ");
		int n1 = sc.nextInt();
		for(int i=1; i<=n1;i++) {
			System.out.println(n + " X " + i + " = " +(n*i));
		}
	}

}
