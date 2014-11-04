package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class _Player {
	
	Player p1;
	
	@Before
	public void setUp(){
		p1 = new Player("Player1");
	}
	
	@Test
	public void winBall_FirstTime_Returns1() throws Exception {
		p1.winBall();
		assertEquals(1, p1.getScore());
	}
	
	@Test
	public void winBall_AfterWinning2Times_Returns2() throws Exception {
		p1.winBall();
		p1.winBall();
		assertEquals(2, p1.getScore());
	}
	
	@Test
	public void getDescription_WhenPlayerIsNew_ReturnsLove() throws Exception {
		assertEquals("Love", p1.getDescription());
	}
	
	@Test
	public void getDescription_AfterWinning1Ball_ReturnsFifteen() throws Exception {
		p1.winBall();
		assertEquals("Fifteen", p1.getDescription());
	}
	
	@Test
	public void getDescription_AfterWinning2Balls_ReturnsThirty() throws Exception {
		p1.winBall();
		p1.winBall();
		assertEquals("Thirty", p1.getDescription());
	}
	
	@Test
	public void getDescription_AfterWinning3Balls_ReturnsFortyFive() throws Exception {
		p1.winBall();
		p1.winBall();
		p1.winBall();
		assertEquals("Forty", p1.getDescription());
	}
}
