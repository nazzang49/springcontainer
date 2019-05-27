package config.user;

import org.springframework.context.annotation.Bean;

import com.cafe24.springcontainer.user.User;

//명시
public class UserConfig01 {

	//빈 객체를 리턴해주는 애노테이션 활용
	@Bean
	public User user() {
		return new User();
	}
	
}
