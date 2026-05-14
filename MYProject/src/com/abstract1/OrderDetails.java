package com.abstract1;

//import java.util.Scanner;

public class OrderDetails {
//	Scanner sc = new Scanner(System.in);
	int orderId;
	String Customername;
	String orderName;
	double price;

	public void displayDetails() {

		System.out.println("Order Number : " + orderId);
		System.out.println("Order Name : " + Customername);
		System.out.println("Order Price : " + price);
	}

}
