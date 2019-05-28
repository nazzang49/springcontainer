package config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.DVDPlayer;
import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

import config.videosystem.DVDConfig;

//Java Config는 configuration 애노테이션 반드시 기입
@Configuration
@Import(DVDConfig.class)
public class DVDPlayerConfig {

	//주입01
	@Bean
	public DVDPlayer dvdplayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
}
