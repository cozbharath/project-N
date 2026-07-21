package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class Product {
	int productId;
	String productName;
	String catogary;
	double price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCatogary() {
		return catogary;
	}

	public void setCatogary(String catogary) {
		this.catogary = catogary;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int productId, String productName, String catogary, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.catogary = catogary;
		this.price = price;
	}

}

public class ProductDetails {

	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product(101, "Tomato", "Vegetables", 50.0),
				new Product(102, "Brinjal", "Vegetables", 60.0), new Product(103, "Potato", "Vegetables", 80.0),
				new Product(104, "Chicken", "Meat", 5 + 100.0), new Product(105, "Cinthal Soap", "Soap", 200.0));

		Function<Product, Double> discount = p1 -> {
			
			return null;
			
		};

		Consumer<Product> f = (f1) -> {
			System.out.println("Product Name : " + f1.productName);
			System.out.println("Price : " + f1.price);
			System.out.println("______________________________________");
		};

		for (Product l : list) {
			f.accept(l);
		}

	}

}
