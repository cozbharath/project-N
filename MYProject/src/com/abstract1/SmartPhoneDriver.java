package com.abstract1;

public class SmartPhoneDriver extends SmartPhone {

	public static void main(String[] args) {
		Camera c1 = new SmartPhoneDriver();
		MusicPlayer m1 = new SmartPhoneDriver();

		c1.takePhoto();
		m1.PlayMusic();
	}

}
