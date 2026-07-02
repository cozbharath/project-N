package com.multithreading;

public class Thread1 extends Thread implements Runnable {

	public static void main(String[] args) {
		System.out.println("Main Thread");
		Thread1 t = new Thread1();
		t.start();
		System.out.println(Thread1.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("main" + i);
		}
	}

	@Override
	public void run() {
		System.out.println("Thread");
		System.out.println(Thread1.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread" + i);
		}
	}

}
