package com.java8features;

interface In2 {
	void sqrt(int n);
}

public class Programm7 {

	public static void main(String[] args) {
		In2 i = (int n) -> 
			System.out.println(n * n);
		
		i.sqrt(5);

	}

}
  