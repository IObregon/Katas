package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class _Player {
	
	Player p1 = new Player("Player1");
	
	@Test
	public void winBall_AnyTimeUsed_ReturnsOneMore() throws Exception {
		assertEquals(0, p1.getScore());
		p1.winBall();
		assertEquals(1, p1.getScore());
		p1.winBall();
		assertEquals(2, p1.getScore());
	}
	
	@Test
	public void getDescription_WhenScoreIsZero_ReturnsLove() throws Exception {
		assertEquals("Love", p1.getDescription());
	}
	
	@Test
	public void getDescription_WhenScoreIsOne_ReturnsFifteen() throws Exception {
		p1.winBall();
		assertEquals("Fifteen", p1.getDescription());
	}
}
