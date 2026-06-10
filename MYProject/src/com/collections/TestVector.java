package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> vl = new Vector<>();
		vl.add(101);
		vl.add(102);
		vl.add(103);
		vl.add(104);
		vl.add(105);
		vl.add(106);
		vl.add(107);
		vl.add(108);
		Enumeration<Integer> en = vl.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
