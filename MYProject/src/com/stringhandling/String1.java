package com.stringhandling;

public class String1 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Initial Memory : " + (rt.totalMemory() / (1024 * 1024) + "MB"));
		System.out.println("Max Memory : " + (rt.maxMemory() / (1024 * 1024) + "MB"));
		System.out.println("Free Memory : " + (rt.freeMemory() / (1024 * 1024) + "MB"));
	}

}
