package com.cafe24.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cafe24.springcontainer.user.User;

import config.user.UserConfig01;

//명시
public class JavaConfigTest01 {

	public static void main(String[] args) {
		testUser01();
		testUser02();
	}
	
	public static void testUser01() {
		//by 클래스(암시적 방법은 autowired 활용)
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(UserConfig01.class);
		User user = appCtx.getBean(User.class);
		
		System.out.println(user);
		
		((ConfigurableApplicationContext)appCtx).close();
	}
	
	public static void testUser02() {
		//by 패키지
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.user");
		User user = appCtx.getBean(User.class);
		
		System.out.println(user);
		
		((ConfigurableApplicationContext)appCtx).close();
	}

}
