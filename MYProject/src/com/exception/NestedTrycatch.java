package com.exception;

public class NestedTrycatch {

	public static void main(String[] args) {
		try {
			System.out.println("Int try1");
			try {
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println("in catch2");
			}
			System.out.println(10 / 0);
		} catch (Exception e) {
			try {
				System.out.println("in try2");
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("in catch3");
			}
			System.out.println("int Cath1");

		} finally {
			try {
				System.out.println("in try3"); 
				System.out.println(10 / 0);
			} catch (Exception e1) {
				System.out.println("in catch4");
			}
			System.out.println("in Finally");
		}

	}

}
