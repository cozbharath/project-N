package com.multithreading;

import java.util.Scanner;

class thread1 extends Thread {
	int n;

	thread1(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " -> " + "FizzBuzz  ");
			}
		}
	}
}

class thread2 extends Thread {
	int n;

	thread2(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 != 0) {
				System.out.print(i + " -> " + "Fizz  ");
			}
		}
	}
}

class thread3 extends Thread {
	int n;

	thread3(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {

			if (i % 5 == 0 && i % 3 != 0) {
				System.out.print(i + " -> " + "Buzz  ");
			}
		}
	}
}

class thread4 extends Thread {
	int n;

	thread4(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {

			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value : ");
		int n = sc.nextInt();

		thread1 f = new thread1(n);
		f.start();

		thread2 f1 = new thread2(n);
		f1.start();

		thread3 f2 = new thread3(n);
		f2.start();

		thread4 f3 = new thread4(n);
		f3.start();

	}

}
