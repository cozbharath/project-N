package com.exception;

import java.util.Scanner;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);

	public String isValidPhone() {

		System.out.println("Enter your Phone number : ");
		String phone = sc.next();
		return phone;
	}

	public String getPassword() {

		System.out.println("Password Age :");
		String password = sc.next();
		return password;
	}

	public int getCustomerAge() {

		System.out.println("Customer Age :");
		int age = sc.nextInt();
		return age;
	}

	public void validateAge(int age) throws AgeExp {
		if (age < 18) {
			throw new AgeExp("Age must be 18 or above.");
		}
	}

	public void validatePassword(String password) throws PasswordExp {
		if (password.length() <= 8) {
			throw new PasswordExp("Password must contain exactly 8 characters.");
		}
	}

	public void validatePhone(String phone) throws MobileException {
		if (phone.length() != 10) {
			throw new MobileException("Phone number must contain exactly 10 digits.");
		}

		if (!phone.matches("\\d+")) {
			throw new MobileException("Phone number should contain only digits.");
		}
	}

	public void display() {
		System.out.println("Registration Successfull");
	}
}
