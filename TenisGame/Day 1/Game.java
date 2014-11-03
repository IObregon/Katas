package kata;

public class Game {
	Player player1;
	Player player2;

	public Game(Player p1, Player p2) {
		this.player1 = p1;
		this.player2 = p2;
	}

	public String getScore() {
		if ( player1.getScore() >= 3 &&  player2.getScore() >= 3) {
			if (Math.abs( player1.getScore() -  player2.getScore()) >= 2) {
				return getLead().getName() + " won!";
			} else if ( player1.getScore() == player2.getScore()) {
				return "Deuce";
			} else {
				return "Advantage for " + getLead().getName();
			}
		} else if (getLead().getScore() > 3) {
			return getLead().getName() + " won!";
		}
		return  player1.getDescription() + " to "
				+  player2.getDescription();
	}

	public Player getLead() {
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}

}
