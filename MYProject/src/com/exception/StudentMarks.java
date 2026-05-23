package com.exception;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = { 99, 50, 100, 55, 80, 85 };

		while (true) {
			try {

				System.out.println("Enter the Positions 0-5");

				int pos = sc.nextInt();

				System.out.println("Student Marks: " + marks[pos]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Entered Position is Not valid ");
				System.out.println("Student Records Not Exists ");
			} catch (Exception e) {
				System.out.println("Values Should be Numbers : ");
				sc.nextLine();
			}
		}
	}

}
