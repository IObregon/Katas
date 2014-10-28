package kata;



public class BerlinClock {

	public String [] getBerlinHour(String fullHour) {
		String input [] = fullHour.split(":");
		return new String[]  {
				getSeconds(Integer.valueOf(input[2])),
				getTopHours(Integer.valueOf(input[0])),
				getBottomHours(Integer.valueOf(input[0])),
				getTopMinutes(Integer.valueOf(input[1])),
				getBottomMinutes(Integer.valueOf(input[1]))
		};
	}	
	

	public String getSeconds(int seconds) {
		if (isPeerNumber(seconds)) return "Y";
		return "O";
	}

	private boolean isPeerNumber(int number) {
		return 0 == number % 2;
	}

	public String getTopHours(int hours) {
		return getOnOffLamps(4, getTopOnLamps(hours), "R");
	}

	public String getBottomHours(int hours) {
		return getOnOffLamps(4, hours % 5, "R");
	}
	
	public String getTopMinutes(int minutes) {
		return getOnOffLamps(11, getTopOnLamps(minutes), "Y").replaceAll("YYY", "YYR");
	}
	
	public String getBottomMinutes(int minutes) {
		return getOnOffLamps(4, minutes % 5, "Y");
	}

	private String getOnOffLamps(int lamps, int onLamps, String onSign) {
		String output = "";
		for (int i = 0; i < onLamps; i++){
			output += onSign;
		}
		for (int i = 0; i < (lamps - onLamps); i++){
			output += "O";
		}
		return output;
	}

	private int getTopOnLamps(int number) {
		return (number - (number % 5))/ 5;
	}








}
