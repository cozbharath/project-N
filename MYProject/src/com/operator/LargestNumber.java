package com.operator;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a Number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter a Number");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Gretest Number is :" + num1);
		}
		else if (num2 > num3 && num2 > num1){
			System.out.println("Gretest Number is :" + num2);
		} else {
			System.out.println("Gretest Number is :" + num3);
		}
	}

}
