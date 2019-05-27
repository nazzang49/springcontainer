package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.user.User;

//컨피규레이션에 설정된 클래스임을 명시(패키지 단위 스캔 시)
@Configuration
public class UserConfig02 {

	//빈 객체를 리턴해주는 애노테이션 활용
	@Bean
	public User user() {
		return new User();
	}
	
}
