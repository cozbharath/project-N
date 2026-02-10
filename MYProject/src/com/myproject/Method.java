package com.myproject;

public class Method {
	static {
		System.out.println("Static Method");
	}
	{
		Method obj1 = new Method();
		System.out.println("Instance Method");
	}
	
	public static void main(String[] args) {
		Method obj = new Method();
	}

}
