package com.cafe24.springcontainer.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=UserConfig01.class)
//@ContextConfiguration(locations= {""})
public class UserTest {

	@Autowired
	private User user;
	
	@Test
	public void testUser() {
		assertTrue(true);
		assertEquals(1, 1);
		//빈 객체가 제대로 설정되었다면 true
		assertNotNull(user);
	}
	
}
