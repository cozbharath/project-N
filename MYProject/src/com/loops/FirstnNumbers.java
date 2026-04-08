package com.loops;

import java.util.Scanner;

public class FirstnNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int s = sc.nextInt();
		while (s <= 100) {
			System.out.print(s +" ");
			s++;
		}
		sc.close();
	}

}
