package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import config.videosystem.DVDPlayerConfig;

/*
 * Explicit Configuration by Java
 *  
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DVDPlayerConfig.class)
public class DVDPlayerJavaConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player;
	
	//cd가 있는지
	@Test
	public void testDVDNull() {
		assertNotNull(dvd);
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
		assertEquals("playing film Marvel's Avengers", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	
}
