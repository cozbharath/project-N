package com.operator;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Grade (A,B,C,D,F)");
		
		char var = sc.next().charAt(0);
		
		switch(var) {
			case 'A' -> System.out.println("Excellent");
			case 'B' -> System.out.println("Good");
			case 'C' -> System.out.println("Average");
			case 'D' -> System.out.println("Poor");
			case 'F' -> System.out.println("Fail");
			default -> System.out.println("Invalid Char");
		}
	}

}
