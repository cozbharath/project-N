package com.myproject;


public class Calculator {
	
	int a;
	int b;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Calculator sum = new Calculator();
		
		sum.a = 10;
		sum.b = 20;
		
		System.out.println("Sum of two Numbers is :" + (sum.a + sum.b));
		System.out.println("Sub of two Numbers is :" + (sum.a - sum.b));
		System.out.println("Multiple of two Numbers is :" + (sum.a * sum.b));
		System.out.println("Div of two Numbers is :" + (sum.a / sum.b));
		System.out.println("Mud of two Numbers is :" + (sum.a % sum.b));

	}

}
