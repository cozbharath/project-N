package com.operator;

import java.util.Scanner;

public class Ifoperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value : ");

		int num = sc.nextInt();

		if (num <= 100 && num >= 61) {
			System.out.println(" You are Seniorcitizen");
		} else if (num <= 60 && num >= 36) {
			System.out.println("You are Middle age Person");
		} else if (num <= 35 && num >= 20) {
			System.out.println("You are Young");
		} else if (num <= 19 && num >= 13) {
			System.out.println("You are Teenager");
		} else if (num <= 12 && num >= 6) {
			System.out.println("You are Children");
		} else {
			System.out.println("You are kid");
		}
	}

}
