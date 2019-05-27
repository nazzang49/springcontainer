package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	//와이어링01(변수 주입)
	@Autowired
	private CompactDisc cd;
	
	public CDPlayer() {
		
	}
	
	//와이어링02(생성자 주입)
	@Autowired
	public CDPlayer(CompactDisc cd) {
		System.out.println(1);
		this.cd=cd;
	}
	
	public void play() {
		cd.play();
	}

	public CompactDisc getCd() {
		return cd;
	}

	//와이어링03(set 메소드 주입)
	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	
	//와이어링04(일반 메소드 주입)
	@Autowired
	public void insertCd(CompactDisc cd) {
		System.out.println(1);
		this.cd = cd;
	}
	
}
