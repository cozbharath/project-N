package com.java8features;

@FunctionalInterface
interface Square {
	int sqre(int a);
}

public class Programme2 {

	public static void main(String[] args) {
		Square sqre = (a) -> a * a;
		System.out.println(sqre.sqre(6));
	}

}
