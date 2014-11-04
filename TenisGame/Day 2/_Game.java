package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class _Game {
	Game game;
	Player p1;
	Player p2;
	
	@Before
	public void setUp(){
		p1 = new Player("Player1");
		p2 = new Player("Player2");
		game = new Game(p1, p2);
	}
	
	@Test
	public void getResult_0To0_ReturnsLoveToLove() throws Exception {
		assertEquals("Love to Love", game.getResult());
	}

	@Test
	public void getResult_1To0_ReturnsFifteenToLove() throws Exception {
		p1.winBall();
		assertEquals("Fifteen to Love", game.getResult());
	}
	
	@Test
	public void getResult_4toO_ReturnsPlayer1Wins() throws Exception {
		p1.winBall();
		p1.winBall();
		p1.winBall();
		p1.winBall();
		assertEquals("Player1 won!", game.getResult());
	}
	
	@Test
	public void getResult_BothHaveScoreMoreThan3PointAndOneScoresTwoTimes() throws Exception {
		deuceTo3();
		p1.winBall();
		p1.winBall();
		assertEquals("Player1 won!", game.getResult());
	}
	private void deuceTo3() {
		p1.winBall();
		p1.winBall();
		p1.winBall();
		p2.winBall();
		p2.winBall();
		p2.winBall();
	}
	
	@Test
	public void getResult_BotHaveScoredMoreThan3PointAndOneScoresOneMore() throws Exception {
		deuceTo3();
		p1.winBall();
		assertEquals("Player1 advantage", game.getResult());
		p2.winBall();
		p2.winBall();
		assertEquals("Player2 advantage", game.getResult());
	}
	
	@Test
	public void getResult_BothHaveScoredMoreThan3PointAndAreEquals() throws Exception {
		deuceTo3();
		p1.winBall();
		p2.winBall();
		assertEquals("Deuce", game.getResult());
	}
}
