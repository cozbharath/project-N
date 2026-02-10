package com.myproject;

public class TestDemo2 {
	
	static {
		TestDemo2 testdemo2= new TestDemo2();
		testdemo2.display();
		
	}
	static void display1 () {
		System.out.println("Static Method Started1");
		
	}
	static void show1() {
		System.out.println("Static Method Started2");	
	}
	
	 public static void main(String[] args) {
		System.out.println("Main Method");
	}
	 
	 void display () {
		 System.out.println("Instance  Method1");
		 display1 ();
		 show();
	 }
	 void show () {
		 System.out.println("Instance Method2");
		 show1();
		 
	 }
	
}
