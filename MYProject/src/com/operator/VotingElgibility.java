package com.operator;

import java.util.Scanner;

public class VotingElgibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int age = sc.nextInt();
		
		if(age >= 18 ) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not Eligile for Voting");
		}
	}

}
