package com.loops;

import java.util.Scanner;

public class EligibleVoting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int eligible = 0;
		int notEligible = 0;

		int age;

		int oldestVoter = Integer.MIN_VALUE;
		int youngestVoter = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter age of Voters : " + i + " : ");
			age = sc.nextInt();

			if (age >= 18) {
				System.out.println("Eligible for Voting");
				eligible++;
				if (age > oldestVoter) {
					oldestVoter = age;

				}

				if (youngestVoter >= age) {
					youngestVoter = age;

				}
			}

			else {
				System.out.println("Not Elgible for Voting");
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
