package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

class Product {
	int productId;
	String productName;
	String catogary;
	double price;
	double discountPrice;
	double finalPrice;

	public Product(int productId, String productName, String catogary, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.catogary = catogary;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", catogary=" + catogary
				+ ", price=" + price + ", finalPrice=" + finalPrice + ", discountPrice=" + discountPrice + "]";
	}

}

public class ProductDetails {

	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product(101, "Tomato", "Vegetables", 50.0),
				new Product(102, "Brinjal", "Vegetables", 60.0), new Product(103, "Potato", "Vegetables", 80.0),
				new Product(104, "Chicken", "Meat", 5 + 100.0), new Product(105, "Cinthal Soap", "Soap", 200.0));

		List<Product> list1 = list.stream().map(p -> {
			p.finalPrice = p.price + (p.price * 18 / 100);
			return p;
		}).collect(Collectors.toList());

		List<Product> list2 = list.stream().map(p -> {
			p.discountPrice = p.finalPrice - (p.price * 10 / 100);
			return p;
		}).collect(Collectors.toList());

		list2.forEach(System.out::println);

	}

}
