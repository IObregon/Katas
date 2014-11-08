package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class _Game {
	Player p1 ;
	Player p2 ;
	Game game;
	
	@Before
	public void setUp(){
		p1 = new Player("Player1");
		p2 = new Player("Player2");
		game = new Game(p1, p2);
	}
	
	@Test
	public void getResult_TheGameStarts_ReturnsLoveToLove() throws Exception {
		assertEquals("Love to Love", game.getResult());
	}
	
	@Test
	public void getResult_Player1ScoresFirstPoint_ReturnsFifteenToLove() throws Exception {
		p1.winBall();
		assertEquals("Fifteen to Love", game.getResult());
	}
	
	@Test
	public void getResult_Player2ScoresAfterPlayer1_ReturnsFifteenToFifteen() throws Exception {
		p1.winBall();
		p2.winBall();
		assertEquals("Fifteen to Fifteen", game.getResult());
	}
	
	@Test
	public void getResult_Player1ScoresTwoPointAfterBeingTied() throws Exception {
		setTied();
		p1.winBall();
		p1.winBall();
		assertEquals("Player1 won!", game.getResult());
	}
	
	@Test
	public void getResult_Player1AndPlayer2GotTheSameScore_ReturnsTied() throws Exception {
		setTied();
		assertEquals("Tied", game.getResult());
	}
	@Test
	public void getResult_Player1ScoresOnePontAfterBeingTiend() throws Exception {
		setTied();
		p1.winBall();
		assertEquals("Player1 advantage", game.getResult());
	}
	
	@Test
	public void getResult_Player1WinsWithLessThan6PlayedBalls_ReturnsPlayer1Won() throws Exception {
		p1.winBall();
		p1.winBall();
		p1.winBall();
		p1.winBall();
		assertEquals("Player1 won!", game.getResult());
	}

	private void setTied(){
		p1.winBall();
		p1.winBall();
		p1.winBall();
		p2.winBall();
		p2.winBall();
		p2.winBall();
	}
}
