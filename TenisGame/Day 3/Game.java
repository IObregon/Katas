package kata;

public class Game {
	Player player1 ;
	Player player2;
	
	public Game (Player player1, Player player2){
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getResult() {
		if (player1.getScore() + player2.getScore() >= 6){
			if (Math.abs(player1.getScore() - player2.getScore()) == 2){
				return getLead().getName() + " won!";
			}else if (player1.getScore() == player2.getScore()){
				return "Tied";
			}else{
				return getLead().getName() + " advantage";
			}
		}else if (getLead().getScore() == 4){
			return getLead().getName() + " won!";
		}
		return player1.getDescription() + " to " + player2.getDescription();
	}
	
	private Player getLead(){
		return (player1.getScore() > player2.getScore())? player1 : player2;
	}
	
}
