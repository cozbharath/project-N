package com.loops;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int eligible = 0;
		int notEligible = 0;

		int age;

		int oldestVoter = 0;
		int youngestVoter = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter age of Voter " + i + ": ");
			age = sc.nextInt();

			// First voter initialization
			if (i == 1) {
				oldestVoter = age;
				youngestVoter = age;
			}

			if (age >= 18) {
				System.out.println("Eligible for Voting");
				eligible++;
				if (age > oldestVoter) {
					oldestVoter = age;
				}

				if (age < youngestVoter) {
					youngestVoter = age;
				}
			} else {
				System.out.println("Not Eligible for Voting");
				notEligible++;
			}

		}

		System.out.println("\n--- Results ---");
		System.out.println("Eligible voters: " + eligible);
		System.out.println("Non-eligible voters: " + notEligible);
		System.out.println("Oldest voter age: " + oldestVoter);
		System.out.println("Youngest voter age: " + youngestVoter);

		sc.close();
	}
}
