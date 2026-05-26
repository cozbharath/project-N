package com.exception;

public class TryCatch {

	public static void main(String[] args) {
		try {
//			System.out.println(10 / 0);
			System.out.println(10.5 / 0); // Infinity
			System.out.println(10.5 / 0.0); // Infinity
			System.out.println(0.0 / 0.0); // Nan
		} catch (Exception e) {
			System.err.println(e.getMessage()); // Description
			System.err.println(e.toString()); // Name + Description
			System.err.println(e); // Name + Description
		}
	}

}
