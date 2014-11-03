package kata;

public class Player {
	private String name ;
	private int score = 0;
	private static String[] description = { "Love", "Fifteen", "Thirty", "Forty"};
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public int getScore(){
		return this.score;
	}

	public void winBall() {
		this.score += 1;
	}

	public String getDescription() {
		return description[this.score];
	}

}
