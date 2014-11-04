package kata;

public class Player {
	
	String name = "";
	int score = 0;
	String [] descriptions = {"Love", "Fifteen", "Thirty", "Forty"};


	public Player(String name){
		this.name = name;
	}

	public void winBall() {
		score += 1;
	}

	public int getScore() {
		return score;
	}

	public String getDescription() {
		return descriptions[getScore()];
	}
	
	public String getName(){
		return this.name;
	}
}
