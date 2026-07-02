package com.multithreading;

public class MultipletThread1 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread1.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("main" + i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Thread");
		Thread1 t = new Thread1();
		t.start();

		Thread1 t1 = new Thread1();
		t1.start();

		Thread1 t2 = new Thread1();
		t2.start();
		
		System.out.println(Thread1.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("main" + i);
		}

	}

}
