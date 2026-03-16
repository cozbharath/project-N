package com.method;

public class MethodWithReturn {
	
	void addnumbers(int a, int b) {
		System.out.println( a + b );
	}
	void subnumbers(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		MethodWithReturn m1 = new MethodWithReturn();
		m1.addnumbers(100, 200);
		m1.subnumbers(200, 50);
	}

}
