package kata;

public class BerlinClock {



	public String getSeconds(int seconds) {
		if (seconds % 2 == 0) return "Y";
		return "O";
	}
	
	public String getTopHours(int hours){
		return getOnOff(4, CalculateTopOnLights(hours), "R");
	}
	
	public String getBottomHours(int hours) {
		
		return getOnOff(4, hours % 5, "R");
	}
	

	public String getTopMinutes(int minutes) {
			
		return getOnOff(11, CalculateTopOnLights(minutes), "Y").replaceAll("YYY", "YYR");
	}
	
	public String getBottomMinutes(int minutes) {
		// TODO Auto-generated method stub
		return getOnOff(4, minutes % 5, "Y");
	}
	
	
	private String getOnOff(int lamps, int onLamps, String onSign){
		String output = "";
		
		for (int i = 0; i < onLamps; i++){
			output += onSign;
		}
		
		for (int i = 0; i < (lamps - onLamps); i++){
			output += "O";
		}
		return output;
	}
	
	private int CalculateTopOnLights(int number){
		return (number - (number % 5)) / 5;
	}





	

}
