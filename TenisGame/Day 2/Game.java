package kata;

public class Game {
	Player player1;
	Player player2;
	
	public Game(Player player1, Player player2){
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getResult() {
		if (player1.getScore() + player2.getScore() > 6 ){
			if (Math.abs(player1.getScore() - player2.getScore()) == 2){
				return getLeader().getName() + " won!";
			}else if (player1.getScore() == player2.getScore()){
				return "Deuce";				
			}else{
				return getLeader().getName() + " advantage";
			}
		}else if ( getLeader().getScore() == 4){
			return getLeader().getName() + " won!";
		}
		return player1.getDescription() + " to " + player2.getDescription();
	}
	
	private Player getLeader(){
		return (player1.getScore() > player2.getScore()) ? player1: player2;
	}
	
	

}
