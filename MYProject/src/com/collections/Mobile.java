package com.collections;

public class Mobile {
	
	String mobile;
	String brand;
	double price;
	
	
	
	@Override
	public String toString() {
		return "Mobile [mobile=" + mobile + ", brand=" + brand + ", price=" + price + "]";
	}



	public Mobile(String mobile, String brand, double price) {
		super();
		this.mobile = mobile;
		this.brand = brand;
		this.price = price;
	}	

}
