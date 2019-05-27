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

/*
 * Explicit Configuration by Java
 *  
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	//영화01
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;
	
	//영화02 by BlankDisc
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;
	
	//영화03 by BlankDisc
	@Autowired
	@Qualifier("avengersEndgame")
	private DigitalVideoDisc dvd4;
	
	//영화04 by BlankDisc
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	private DigitalVideoDisc dvd5;
	
	//영화05 by BlankDisc
	@Autowired
	@Qualifier("captainAmerica")
	private DigitalVideoDisc dvd6;
	
	//영화06 by BlankDisc
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd7;
	
	//영화07 by BlankDisc
	@Autowired
	@Qualifier("avengersExpansionPack1")
	private DigitalVideoDisc dvd8;
	
	@Autowired
	@Qualifier("avengersExpansionPack2")
	private DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengersExpansionPack3")
	private DigitalVideoDisc dvd10;
	
	@Autowired
	private DVDPack dvdPack;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	private DVDPlayer player2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player3;
	
	@Autowired
	@Qualifier("dvdPlayer4")
	private DVDPlayer player4;
	
	@Autowired
	@Qualifier("dvdPlayer5")
	private DVDPlayer player5;
	
	//프로퍼티 활용
	@Autowired
	@Qualifier("dvdPlayer6")
	private DVDPlayer player6;
	
	@Autowired
	@Qualifier("dvdPlayer7")
	private DVDPlayer player7;
	
	//dvd가 있는지
	@Test
	public void testDVD2Null() {
		assertNotNull(dvd2);
	}
	
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
		System.out.println(dvd3);
		assertEquals("BlankDisc [title=Avengers Infinity War, studio=Marvel, actors=null]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
		System.out.println(dvd4);
		assertEquals("BlankDisc [title=Avengers End Game, studio=Marvel, actors=null]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
		System.out.println(dvd5);
		assertEquals("BlankDisc [title=Avengers Age Of Ultron, studio=Marvel, actors=null]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
		System.out.println(dvd6);
		assertEquals("BlankDisc [title=Captain America, studio=Marvel, actors=null]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=Avengers Director Edition, studio=Marvel, actors=[Elizabeth Olsen, Chris Evans, Tom Holland]]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack1, studio=Marvel, actors=[Elizabeth, Chris, Tom]]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=Marvel, actors=[Elizabeth, Chris, Tom]]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
		System.out.println(dvd10);
		assertEquals("BlankDisc [title=Avengers Expansion Pack3, studio=Marvel, actors=[Elizabeth, Chris, Tom]]", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testDVDPack() {
		assertNotNull(dvdPack);
	}
	
	//player가 있는지
	@Test
	public void testPlayer2Null() {
		assertNotNull(player2);
	}
	
	@Test
	public void testPlay2() {
		player2.play();
		assertEquals("playing film Marvel's Iron Man", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("playing film Marvel's Iron Man", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testPlay4() {
		player4.play();
		assertEquals("playing film Marvel's Iron Man", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testPlay5() {
		player5.play();
		assertEquals("playing film Marvel's Iron Man", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testPlay6() {
		player6.play();
		assertEquals("playing film Marvel's Avengers Infinity War", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
	
	@Test
	public void testPlay7() {
		player6.play();
		assertEquals("playing film Marvel's Avengers Infinity War", systemOutRule.getLog().replaceAll("\r\n", ""));
	}
}
