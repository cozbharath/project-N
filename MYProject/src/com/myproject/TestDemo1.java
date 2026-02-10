package com.myproject;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		show();
	}

	static void show() {
		String colName = "Narsimha Reddy Engineering College";
		System.out.println("College Name : " + colName);
		TestDemo1 t = new TestDemo1();
		t.display();

	}
	
	void display() {
		
		int stdId = 512;
		int stdNumber = 818982349;
		String stdEmail = "Navabharath.podila@gmail.com";
		String stdName = "Nava Bharath Kumar";
		System.out.println("Student Name is : " + stdName);
	}
}
