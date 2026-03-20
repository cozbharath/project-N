package com.operator;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int marks = sc.nextInt();
		if(marks >= 35) {
			System.out.println("You are Pass");
		} else {
			System.out.println("You are Fail");
		}
	}

}
