package com.operator;

import java.util.Scanner;

public class ArithmeticUseSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		
		System.out.println("Enter b Number");
		int b = sc.nextInt();
		
		System.out.println("Arithmetic Calculations !");
		String var = sc.next();
		
		switch(var) {
			case "+" -> {
				System.out.println("Addition");
				System.out.println("Sum of two Numbers : " +(a+b));
			}
			case "-" -> {
				System.out.println("Substriction");
				System.out.println("Sub of two Numbers : " +(a-b));
			}
			case "*" -> {
				System.out.println("Multiplication");
				System.out.println("Mul of two Numbers : " +(a*b));
			}
			case "/" -> {
				System.out.println("Division");
				System.out.println("Div of two Numbers : " +(a/b));
			}
			case "%" -> {
				System.out.println("Modulous");
				System.out.println("Mod of two Numbers : " +(a%b));
			}
			
			default -> System.out.println("Enter Operation is Invalid");
		}
	}

}
