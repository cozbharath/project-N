package com.accessmodifier1;

public class AccessModifier1 {
//	 public data members 
	public int a3 = 8;
	public String name3 = "Jedaja";

	public void method3() {
		System.out.println("Method2 Class");
	}
	
//	Protected data members 
	protected int a4 = 17;
	protected String name4 = "Pant";
	protected void method4() {
		System.out.println("Method Class");
	}

//	default data members
	int a2 = 33;
	String name = "Hardik";
	static {
		System.out.println("Static block called");
	}
	{
		System.out.println("Instance block called");
	}

	void method2() {
		System.out.println("Method2 Class");
	}

//	Private data members
	private int a1 = 45;
	private String name1 = "Rohit";

	private void method1() {
		System.out.println("Method1 Called");
	}

	public AccessModifier1() {
		System.out.println("Constructor Called");
	}

	public static void main(String[] args) {
//		AccessModifier1 t1 = new AccessModifier1();
//		System.out.println(t1.a1);
//		System.out.println(t1.name1);
//		t1.method1();

		AccessModifier1 t1 = new AccessModifier1();
//		System.out.println(t1.a2);
//		System.out.println(t1.name);
//		t1.method2();
//		
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();
	}

	private class test {

	}
}
