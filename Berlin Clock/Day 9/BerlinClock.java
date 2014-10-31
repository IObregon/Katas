package kata;

public class BerlinClock {

	public String getSeconds(int seconds) {
		if ( 0 == seconds % 2 )return "Y";
		return "O";
	}

	public String getTopHours(int hours) {
		return getOnOff(4, getTopOnLamps(hours), "R");
	}
	
	public String getBottomHours(int hours) {
		return getOnOff(4, hours % 5, "R");
	}
	
	public String getTopMinutes(int minutes) {
		return getOnOff(11, getTopOnLamps(minutes), "Y").replaceAll("YYY", "YYR"); 
	}

	public String getBottomMinutes(int minutes) {
		return getOnOff(4, minutes % 5, "Y");
	}
	public String[] getBerlinHour(String time) {
		String[] input = time.split(":");
		return new String[] {getSeconds(Integer.valueOf(input[2])),
				getTopHours(Integer.valueOf(input[0])),
				getBottomHours(Integer.valueOf(input[0])),
				getTopMinutes(Integer.valueOf(input[1])),
				getBottomMinutes(Integer.valueOf(input[2]))
		};
	}
	private String getOnOff(int lamps, int onLamps, String onSign) {
		String output = "";
		for ( int i = 0; i < onLamps; i++ ) output += onSign;
		for ( int i = 0; i < (lamps - onLamps); i++ )output += "O";
		return output;
	}


	private int getTopOnLamps(int number) {
		return (number - (number % 5)) / 5;
	}





}
