package com.exception;

import java.util.Scanner;

public class SettingPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Password should contain 1 capital, 1 number, 1 special character and 8 characters");
		System.out.println("Enter the Password");
		String password = sc.nextLine();

		try {
			if (password.length() < 8) {
				throw new WeakPasswordException("Password must be at least 8 characters");
			}

			if (!password.matches("[A-Z]{1}[0-9]{1}[@#\\-]{1}[a-z]{5}")) {
				throw new WeakPasswordException("Password format is not correct");
			}

			System.out.println("Successfully set password");
		} catch (WeakPasswordException e) {
			System.err.println(e.getMessage());
		}

		sc.close();
	}
}
