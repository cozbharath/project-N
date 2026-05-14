package com.abstract1;

public class SmartPhone implements Camera, MusicPlayer {

	@Override
	public void PlayMusic() {
		System.out.println("Play Music");

	}

	@Override
	public void takePhoto() {
		System.out.println("Click photo");
	}

}
