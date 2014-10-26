package kata;

public class BerlinClock {

	public String getSeconds(int seconds) {
		if (seconds % 2 == 0) return "Y";
		return "O";
	}

	public String getTopHours(int hours) {
		return getOnOff(4, getOnLamps(hours), "R");
	}

	
	public String getBottomHours(int hours) {
		
		return getOnOff(4, hours % 5, "R");
	}

	public String getTopMinutes(int minutes) {
		return getOnOff(11, getOnLamps(minutes), "Y").replaceAll("YYY", "YYR");
	}
	
	public String getBottomMinutes(int minutes) {
		return getOnOff(4, minutes % 5, "Y");
	}
	
	/**
	 * 
	 * @param lamps -> Number of lamps
	 * @param onLamps -> Number of on Lamps
	 * @param onSign -> The String that represent the on.
	 * @return String with the on and off lights.
	 */
	public String getOnOff(int lamps, int onLamps, String onSign){
		String output = "";
		for (int i = 0; i < onLamps; i++){
			output += onSign;
		}
		for (int i =0 ; i < (lamps - onLamps); i++){
			output += "O";
		}
		return output;
	}
	
	/**
	 * Returns the number of On Lamps.
	 * @param number 
	 * @return
	 */
	private int getOnLamps(int number) {
		return (number - (number % 5)) / 5;
	}
}
