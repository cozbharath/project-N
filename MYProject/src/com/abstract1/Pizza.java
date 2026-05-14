package com.abstract1;

public class Pizza extends OrderDetails implements FoodOrder {

	public Pizza(int orderId,String Customername, String orderName, double price) {
		this.orderId = orderId;
		this.Customername = Customername; 
		this.orderName = orderName;
		this.price = price;
	}

	@Override
	public void displayDetails() {
		System.out.println("Order Number : " + orderId);
		System.out.println("Order Name : " + Customername);
		System.out.println("Order Item : " + orderName);
		System.out.println("Order Price : " + price);
	}

	public void prepareFood() {
		System.out.println("Order is Preparing");
	}

}
