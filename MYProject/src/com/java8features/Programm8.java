package com.java8features;

public class Programm8 {

	public static void main(String[] args) {
		Runnable t1 = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i + " Thread");
			}
		};
		Thread t = new Thread(t1);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " main");
		}
	}

}
