package kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class _Game {

	Game game ;
	Player p1;
	Player p2;
	
	@Before
	public void setUp(){
		p1 = new Player("Player1");
		p2 = new Player("Player2");
		game = new Game(p1,p2);
	}
	
	@Test
	public void getScore_WhenGameIsNew_ReturnsLoveToLove() throws Exception {
		assertEquals("Love to Love", game.getScore());
	}
	
	@Test
	public void getScore_Player1Scores_ReturnsFifteenToLove() throws Exception {
		p1.winBall();
		assertEquals("Fifteen to Love", game.getScore());
	}
	
	@Test
	public void getScore_ScoreIsTheSameFor2PlayersAndMoreThan3_ReturnsDeuce() throws Exception {
		DeuceTo3();
		assertEquals("Deuce", game.getScore());
		p1.winBall();
		p2.winBall();
		assertEquals("Deuce", game.getScore());
	}
	
	@Test
	public void getScore_ScoreIsTheSameFor2PlayersMoreThan3AndPlayer2WinsABall_ReturnsAdvantageForPlayer2() throws Exception {
		DeuceTo3();
		p2.winBall();
		assertEquals("Advantage for Player2", game.getScore());
	}
	
	@Test
	public void getScore_ScoreIsTheSameFor2PlayersMoreThan3AndPlayer1WinsABall_ReturnsAdvantageForPlayer1() throws Exception {
		DeuceTo3();
		p1.winBall();
		assertEquals("Advantage for Player1", game.getScore());
	}
	
	@Test
	public void getLeadPlayer_ReturnsThePlayerWhoIsLeadering() throws Exception {
		p1.winBall();
		assertEquals("Player1", game.getLead().getName());
	}
	
	@Test
	public void getScore_OnePLayersScoreIs2MoreThanOtherScore_ReturnsPlayer1Won() throws Exception {
		DeuceTo3();
		p1.winBall();
		p1.winBall();
		assertEquals("Player1 won!",game.getScore());
	}
	
	@Test
	public void getScore_FirstPlayerWins4Balls_ReturnsPlayer1Win() throws Exception {
		p1.winBall();
		p1.winBall();
		p1.winBall();
		p1.winBall();
		assertEquals("Player1 won!", game.getScore());
	}
	
	

	private void DeuceTo3() {
		p1.winBall();
		p1.winBall();
		p1.winBall();
		p2.winBall();
		p2.winBall();
		p2.winBall();
	}

}
