package com.cafe24.springcontainer.videosystem;

import java.util.List;

//dvd 패키지
public class DVDPack {

	private String title;
	private List<DigitalVideoDisc> dvds;
	
	public DVDPack(String title, List<DigitalVideoDisc> dvds) {
		this.title=title;
		this.dvds=dvds;
	}
	
	@Override
	public String toString() {
		return "DVDPack [title=" + title + ", dvds=" + dvds + "]";
	}
	
}
