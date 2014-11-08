package kata;

public class Player {
	
	private String name = "";
	private int score;
	private static String[] description = { "Love", "Fifteen", "Thirty", "Forty"};
	
	public Player (String name){
		this.name = name;
		score = 0;
	}

	public int getScore() {
		return this.score;
	}
	public String getName(){
		return this.name;
	}

	public void winBall() {
		this.score +=1;
	}

	public String getDescription() {
		return this.description[this.score];
	}
}
