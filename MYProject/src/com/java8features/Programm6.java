package com.java8features;

@FunctionalInterface
interface In1 {
	void methos();
}

public class Programm6 {

	public static void main(String[] args) {
		In1 i = () -> 
			System.out.println("Hello");
		i.methos();
	}
}
