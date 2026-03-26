package com.operator;

import java.util.Scanner;

public class JobApproval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is Your Name ?");
		String name = sc.nextLine();
		System.out.println("What is your sge");
		int age = sc.nextInt();
		sc.nextLine();

		if (age >= 21 && age <= 27) {
			System.out.println("Enter You Qulification");
			String Qulification = sc.nextLine();
			if (Qulification.equalsIgnoreCase("B.TECH") || Qulification.equalsIgnoreCase("Degree")) {
				System.out.println("Are you completed Graduitation");
				String grad = sc.nextLine();

				if (grad.equalsIgnoreCase("yes")) {
					System.out.println("What is your persentage");
					double marks = sc.nextDouble();
					if (marks >= 65 && marks <= 100) {
						System.out.println("What is you Experience");
						double experience = sc.nextDouble();
						sc.nextLine();
						if (experience <= 3) {
							System.out.println("What is your Previous Company Name");
							String comp = sc.nextLine();
							System.out.println("What are the Skills You Have ");
							String skills = sc.nextLine();
							if (skills.equalsIgnoreCase("Java") || skills.equalsIgnoreCase("SQL")
									|| skills.equalsIgnoreCase("Spring")) {
								System.out.println("Congratulations You are shortlested");
							}
						} else if (experience == 0) {
							System.out.println("What are the Skills You Have");
							String skills = sc.nextLine();
							if (skills.equalsIgnoreCase("Java") || skills.equalsIgnoreCase("SQL")
									|| skills.equalsIgnoreCase("Spring")) {
								System.out.println("Congratulations You are shortlested");
							}
						} else {
							System.out.println("Better luck Next time");
						}
					} else {
						System.out.println("You are not Eligible");
					}
				} else {
					System.out.println("Need to Complete Gradution");
				}
			} else {
				System.out.println("Not Eligible");
			}

		} else {
			System.out.println("You are Not Match for the Requirement");
		}
	}

}
