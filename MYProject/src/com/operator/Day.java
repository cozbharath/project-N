package com.operator;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day in week");
		
		String day = sc.nextLine();
		
		switch(day) {
			case "Monday" -> System.out.println("Work Mode Started");
			case "Tuesday","Wendesday","Thursday" -> System.out.println("Work days");
			case "Friday" -> System.out.println("Week End Mode Started");
			case "Saturday","Sunday" -> System.out.println("Week Ends");
			default -> System.out.println("Enter day is Invalid");
		}
	}

}
