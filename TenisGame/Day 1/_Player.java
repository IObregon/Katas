package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class _Player {

	Player p1 ;
	
	@Before
	public void setUp(){
		p1 = new Player("Player1");
	}
	@Test
	public void getName_OnceThePlayerIsCreated_ReturnsTheName() throws Exception {
		assertEquals("Player1", p1.getName());
	}
	
	@Test
	public void winBall_IncrementsScoreBy1() throws Exception {
		p1.winBall();
		assertEquals(1, p1.getScore());
		p1.winBall();
		assertEquals(2, p1.getScore());
	}
	
	@Test
	public void getPointDescription_ReturnTheDescriptionForThePlayerScore() throws Exception {
		assertEquals("Love", p1.getDescription());
		p1.winBall();
		assertEquals("Fifteen", p1.getDescription());
	}
}
