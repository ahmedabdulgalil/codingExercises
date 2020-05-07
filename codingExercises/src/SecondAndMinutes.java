
public class SecondAndMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));

	}
	
	public static String getDurationString( int minutes, int seconds) {
		if (( minutes < 0) || ((seconds < 0) || (seconds > 59))){
			//System.out.println(" invalid mintues or seconds");
			return "invalid value";
		}
		int hour =  minutes / 60;
		int remainingMinutes = minutes % 60;
		return hour + "h " + remainingMinutes + "m " + seconds + "s";
		
	}
	public static String getDurationString (int seconds) {
		if (seconds < 0) {
			System.out.println("invalid second");
			return "invalid value";
		}
		int secondToMinutes =  seconds / 60;
		int reaminingSeconds = seconds % 60;
		return getDurationString(secondToMinutes, reaminingSeconds);
	}
	
	

}
