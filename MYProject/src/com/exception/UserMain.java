package com.exception;

public class UserMain extends UserRegistration {

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();

		try {
			int age = user.getCustomerAge();
			String password = user.getPassword();
			String phone = user.isValidPhone();

			user.validateAge(age);
			user.validatePassword(password);
			user.validatePhone(phone);

			user.display();

		} catch (AgeExp | PasswordExp | MobileException e) {
			System.out.println("Registration Failed: " + e.getMessage());
		}
	}

}
