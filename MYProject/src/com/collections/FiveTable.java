package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiveTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		System.out.println("Enter the Multipe Number :");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter element :");
			list.add(sc.nextInt());
		}

		for (Integer l : list) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(l + " X " + i + " = " + (l * i));
			}
		}
	}

}
