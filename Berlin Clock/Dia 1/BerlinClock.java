package kata;

public class BerlinClock {
	
	public String getSeconds(int seconds){
		if (seconds % 2 == 0) return "Y";
		return "O";
	}
	
	public String getTopHours(int hours){
		return getOnOff(4,getNumberOfTopLampsOn(hours), "R");
		
	}
	
	public String getBottomHours(int hours){
		return getOnOff(4, hours % 5, "R");
	}
	
	public String getTopMinutes(int minutes){
		return getOnOff(11, getNumberOfTopLampsOn(minutes), "Y").replace("YYY", "YYR");
	}
	
	public String getBottomMinutes(int minutes){
		return getOnOff(4,minutes % 5, "Y");
	}
	
	public String getOnOff(int lamps, int lampsOn, String onSign ){
		String out = "";
		for (int i = 0; i < lampsOn; i++){
			out += onSign;
		}
		System.out.println();
		for (int i = 0; i < (lamps - lampsOn) ; i++){
			out += "O";
		}
		return out;
	}
	
	public int getNumberOfTopLampsOn(int number){
		return (number -(number % 5)) / 5;
	}
}
