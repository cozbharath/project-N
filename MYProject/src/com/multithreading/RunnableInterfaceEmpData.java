package com.multithreading;

class RunnableInterfaceEmpData3 implements Runnable {

	@Override
	public void run() {
		String name = "Nava Bharath";
		int id = 101;
		double salary = 50000.00;

		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
}

class RunnableInterfaceEmpData1 implements Runnable {

	@Override
	public void run() {
		String name = "Charan";
		int id = 102;
		double salary = 5000.00;

		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
}

class RunnableInterfaceEmpData2 implements Runnable {

	@Override
	public void run() {
		String name = "Kumar";
		int id = 103;
		double salary = 20000.00;

		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
}

public class RunnableInterfaceEmpData {

	public static void main(String[] args) {

		RunnableInterfaceEmpData3 rt = new RunnableInterfaceEmpData3();
		Thread t = new Thread(rt);

		RunnableInterfaceEmpData1 rt1 = new RunnableInterfaceEmpData1();
		Thread t1 = new Thread(rt1);

		RunnableInterfaceEmpData2 rt2 = new RunnableInterfaceEmpData2();
		Thread t2 = new Thread(rt2);

		t.start();
		t1.start();
		t2.start();
	}
}