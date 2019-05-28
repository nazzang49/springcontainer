package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.BlankDisc;

//명시적 by 자바
@Configuration
public class DVDConfig {

	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	@Bean(name="avengersInfinityWar")
	public BlankDisc blankDisc() {
		BlankDisc bd = new BlankDisc();
		bd.setTitle("Avengers");
		bd.setStudio("Marvel");
		return bd;
	}
	
	
	
}
