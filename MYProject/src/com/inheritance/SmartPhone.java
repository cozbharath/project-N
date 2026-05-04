package com.inheritance;

public class SmartPhone extends Device {
	
	void getMakeCall() {
		System.out.println("You Have ability to call to th people : ");
	}

	public static void main(String[] args) {

		SmartPhone device = new SmartPhone();

		device.getShowDetails();
		device.display();
		device.getMakeCall();

	}

}
