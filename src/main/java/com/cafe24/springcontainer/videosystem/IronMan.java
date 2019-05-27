package com.cafe24.springcontainer.videosystem;

public class IronMan implements DigitalVideoDisc {

	private String title = "Iron Man";
	private String studio = "Marvel";
	
	@Override
	public void play() {
		System.out.println("playing film "+studio+"'s "+title);
		
	}
	

}
