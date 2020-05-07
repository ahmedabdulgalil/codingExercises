
public class DecimalComparator {
	
	
	public static boolean areEqualThreeDecimalPlaces ( double number, double number1 ) {
		
		int myFirstValue = (int)( number * 1000);
		int mySecondValue = (int) ( number1 * 1000);
		
		if ( myFirstValue == mySecondValue) {
			return true;
		} else {
			return false;
		}
	}

}
