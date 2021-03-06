package com.cafe24.springcontainer.videosystem;

import java.util.List;

//disc 예시
public class BlankDisc implements DigitalVideoDisc {

	private String title;
	private String studio;
	private List<String> actors;
	
	public BlankDisc() {
		
	}
	
	public BlankDisc(String title, String studio) {
		this.title=title;
		this.studio=studio;
	}
	
	public BlankDisc(String title, String studio, List<String> actors) {
		this.title=title;
		this.studio=studio;
		this.actors=actors;
	}
	
	@Override
	public void play() {
		System.out.println("playing film "+studio+"'s "+title);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "BlankDisc [title=" + title + ", studio=" + studio + ", actors=" + actors + "]";
	}
	
}
