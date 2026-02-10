package com.myproject;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main Method started");
//		Class.forName("com.myproject.Student");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class Loading Sucessfuly");
	}
 
}
