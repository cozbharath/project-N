package com.abstract1;

public class PrepeaingDetails {

	public static void main(String[] args) {
		Pizza p = new Pizza(101,"Nava Bharath","Chicken Pizza", 500);
		p.prepareFood();
		p.displayDetails();
		
		
		System.out.println("*******************************");
		Burger b = new Burger(101,"Nava Bharath", "Chicken Burger",200);
		b.prepareFood();
		b.displayDetails();

	}

}
