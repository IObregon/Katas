package kata;

import java.util.ArrayList;

public class BerlinClock {

	public String getSeconds(int second) {
		if (isDivisbleBy2(second)) return "Y";
		return "O";
	}

	private boolean isDivisbleBy2(int number) {
		return ( 0 == number % 2);
	}

	public String getTopHours(int hours) {
		return getOnOffLigth(4, getTopOnLamps(hours) , "R");
	}

	
	public String getBottomHours(int hours) {
		return getOnOffLigth(4, hours % 5, "R");
	}

	public String getTopMinutes(int minutes) {
		return getOnOffLigth(11, getTopOnLamps(minutes), "Y").replaceAll("YYY", "YYR");
	}

	private String getOnOffLigth(int lamps, int onLamps, String onSign) {
		String output = "";
		for (int i = 0; i< onLamps; i++){
			output += onSign;
		}
		for (int i = 0; i < (lamps - onLamps); i++){
			output += "O";
		}
		
		return output;
	}
	
	private int getTopOnLamps(int number) {
		return (number - (number % 5)) / 5;
	}

	public String getBottomMinutes(int minutes) {
		return getOnOffLigth(4, minutes % 5, "Y");
	}

	public String[] getBerlinHour(String time) {
		String[] output ;
		if ( time.length() != 8 ){
			 output = new String[]{"00","00", "00"};
		}else{
			output = time.split(":");
		}
		return new String[] { getSeconds(Integer.valueOf(output[2])),
				getTopHours(Integer.valueOf(output[0])), 
				getBottomHours(Integer.valueOf(output[0])),
				getTopMinutes(Integer.valueOf(output[1])),
				getBottomMinutes(Integer.valueOf(output[1]))};
	}
	




}
