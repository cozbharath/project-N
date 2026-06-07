package com.collections;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		System.out.println(list.get(1));// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out
										// of bounds for length 1
	}

}
