package com.arrays;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students : ");
		int size = sc.nextInt();
		System.out.println("Enter Number of Subjects : ");
		int n = sc.nextInt();
		int[][] marks = new int[size][n];
		System.out.println("Enter the names and Marks : ");
		int total_sum = 0;
		int highestMarks = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < n; j++) {
				marks[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < size; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += marks[i][j];
			}
			total_sum = sum;

			if (total_sum > max) {
				max = total_sum;
				highestMarks = i;
			}

			System.out.println("Sum of Students Marks from all Subjects " + i + " = " + sum);
		}
		System.out.println("Topper Student is : " + highestMarks);
		System.out.println();

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < size; j++) {
				sum += marks[j][i];
			}

			System.out.println("Sum of Each Subject Marks " + i + " = " + sum);
		}
	}

}
