package com.cafe24.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import config.soundsystem.CDPlayerConfig;

/*
 * Auto Configuration by Java
 * Component Scanning(@Component, @Named, @Autowired, @Inject) - 컴포넌트 = 네임드(자바) / 오토 와이어드 = 인젝트(자바)
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
//같은 프로젝트 내 있는 config 클래스를 컨테이너로 등록(해당 컨테이너에서 필요한 작업에 수반되는 빈 객체 스캔)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerJavaConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer player;
	
	//cd가 있는지
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	//플레이어가 있는지
	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}
	
	//제대로 플레이 되는지
	@Test
	public void testPlay() {
		player.play();
		assertEquals("playing sickomode by travis scott\r\n", systemOutRule.getLog());
	}
}
