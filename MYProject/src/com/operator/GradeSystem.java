package com.operator;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int marks = sc.nextInt();
		if(marks >=91 && marks <=100) {
			System.out.println(" Grade : A+");
		} else if(marks >=81 && marks <=90) {
			System.out.println("Grade : A");
		} else if(marks >=71 && marks <=80) {
			System.out.println("Grade : B+");
		} else if(marks >=61 && marks <=70) {
			System.out.println("Grade : B");
		} else if(marks >=51 && marks <=60) {
			System.out.println("Grade : C+");
		} else if(marks >=41 && marks <=50) {
			System.out.println("Grade : C");
		} else if(marks >=35 && marks <=40) {
			System.out.println("Grade : D");
		} else {
			System.out.println("You are Fail");
		}
	}

}
