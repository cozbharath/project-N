package com.myproject;

class a {
	void show() {
		System.out.println("Hello1");
	}
}

class UnderstandFinal extends a {
	void show() {
		System.out.println("Hello2");
	}

	public static void main(String[] args) {
		UnderstandFinal a1 = new UnderstandFinal();
		a1.show();
//		a1.display();
		
	}

}
