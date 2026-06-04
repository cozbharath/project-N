package com.exception;

import java.util.Scanner;

public class Eligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age");

		int age = sc.nextInt();

		try {
			if (age > 18) {
				System.out.println("Elgible for Voting");
			} else {
				throw new VotingElgible("You are not eligible for voting");
			}
		} catch (VotingElgible e) {
			System.err.println(e.getMessage());
		}
	}

}
