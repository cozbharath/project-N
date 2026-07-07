package com.multithreading;

class book1 implements Runnable {
	String book = "Charan Stories";
	int days = 15;
	int fine = 10;
	int left = days - 7;

	@Override
	public void run() {
		if (days > 7) {
			fine = fine * left;
			System.out.println("Total Fine " + fine + " Extra No of Days :" + left);
		} else {
			System.out.println("No Fine");
		}

	}

}

class book2 implements Runnable {
	String book = "StringBoot";
	int days = 6;
	int fine = 10;
	int left = days - 7;

	@Override
	public void run() {
		if (days >= 7) {
			fine = fine * left;
			System.out.println("Total Fine " + fine + " Extra No of Days :" + left);
		} else {
			System.out.println("No Fine");
		}

	}

}

class book3 implements Runnable {
	String book = "Charan Microservices";
	int days = 25;
	int fine = 10;
	int left = days - 7;

	@Override
	public void run() {
		if (days > 7) {
			fine = fine * left;
			System.out.println("Total Fine " + fine + " Extra No of Days :" + left);
		} else {
			System.out.println("No Fine");
		}

	}

}

public class Libabirybook {

	public static void main(String[] args) {

		book1 b1 = new book1();
		Thread t = new Thread(b1);
		t.start();

		book2 b2 = new book2();
		Thread t1 = new Thread(b2);
		t1.start();

		book3 b3 = new book3();
		Thread t2 = new Thread(b3);
		t2.start();
	}

}
