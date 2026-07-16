package com.java8features;

@FunctionalInterface
interface Hello {
	void print();
}

public class Programm1 {

	public static void main(String[] args) {
		Hello h = () -> System.out.println("Hello World");
		h.print();
	}

}
