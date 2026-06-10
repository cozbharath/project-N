package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test4 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pineapple");

		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("******************************************");
		List<String> vigs = new ArrayList<>();
		vigs.add("Banana");
		vigs.add("Patoto");
		vigs.add("Tomato");
		vigs.add("Carrot");

		ListIterator<String> itl = vigs.listIterator();
		while (itl.hasNext()) {
			System.out.println(itl.next());
		}
		System.out.println("*********************************************");
		ListIterator<String> it = vigs.listIterator(vigs.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
