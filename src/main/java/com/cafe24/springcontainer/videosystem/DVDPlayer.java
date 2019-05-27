package com.cafe24.springcontainer.videosystem;

//DVD 주입
public class DVDPlayer {

	private DigitalVideoDisc dvd;
	
	public DVDPlayer() {
		
	}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	void play() {
		dvd.play();
	}

	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

}
