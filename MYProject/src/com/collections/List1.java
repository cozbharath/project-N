package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		list.add("Pineapple");
		list.add("Grapes");

		List<String> vgs = new ArrayList<>();
		vgs.add("Carrot");
		vgs.add("Banana");
		vgs.add("Brinjel");
		vgs.add("Ladis finger");
		vgs.add("Tomato");
		System.out.println(list.retainAll(vgs));
	}

}
