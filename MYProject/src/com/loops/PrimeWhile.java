package com.loops;

import java.util.Scanner;

public class PrimeWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int i =2;
		boolean status = true;
		while (i < n) {
			if (n % i == 0) {
				status = false;
				break;
			}
			i++;
		}
		if (status) {
			System.out.println("The given number is Prime");
		} else {
			System.out.println("The given number is not Prime");
		}
	}

}
