package com.cafe24.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//컴포넌트 or 네임드 둘다 가능
@Named("TravisScottStarGazing")
public class TravisScottStarGazing implements CompactDisc {

	private String title = "sickomode";
	private String artist = "travis scott";
	
	@Override
	public void play() {
		System.out.println("playing "+title+" by "+artist);
	}

}
