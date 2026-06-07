package com.collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(1);
		System.out.println(list);
	}

}
