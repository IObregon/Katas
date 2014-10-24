package kata;

public class BerlinClock {
	
	public String getSeconds(int seconds){
		if (seconds % 2 == 0) return "Y";
		return "O";		
	}
	
	public String getTopHours(int hours){
		return getOnOff(4, getTopOnLigths(hours), "R");
	}
	
	public String GetBottomHours (int hours){
		return getOnOff(4, hours % 5, "R");
	}
	
	public String getTopMinutes (int minutes){
		return getOnOff(11, getTopOnLigths(minutes), "Y").replaceAll("YYY", "YYR");
	}
	
	public String getBottomMinutes (int minutes){
		return getOnOff(4, minutes % 5, "Y");
	}
	
	private String getOnOff(int lamps, int onLamps, String onSign){
		String outup = "";	
		for (int i=0; i < onLamps; i++){
			outup += onSign;
		}
		for (int i=0; i < (lamps - onLamps); i++){
			outup += "O";
		}
		return outup;
	}
	
	private int getTopOnLigths(int number){
		return (number - (number % 5)) / 5;
	}
	
}
