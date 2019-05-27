package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.DVDPlayer;
import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

//Java Config는 configuration 애노테이션 반드시 기입
@Configuration
public class DVDPlayerConfig {

	//자동으로 컴포넌트 스캔하는 방식이 아니므로, bean 객체 수동 명시 필요
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	//주입01
	@Bean
	public DVDPlayer dvdplayer() {
		return new DVDPlayer(avengers());
	}
	
	//주입02
	@Bean
	public DVDPlayer dvdplayer1(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	//주입03
	@Bean(name="dvdPlayer2")
	public DVDPlayer dvdplayer2(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer(dvd);
		player.setDvd(dvd);
		return player;
	}
	
	//주입03
	@Bean(name="dvdPlayer3")
	public DVDPlayer dvdplayer3(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer(dvd);
		player.setDvd(dvd);
		return player;
	}
	
}
