package com.java8features;

interface Calculator {
	int add(int a, int b);
	//int sum(int a, int b);
	
}

public class Programme1 {

	public static void main(String[] args) {
		Calculator add = (a, b) -> (a + b);
		System.out.println(add.add(10, 20));
	}

}
