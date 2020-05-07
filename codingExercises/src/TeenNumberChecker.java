
public class TeenNumberChecker {
	
	public static boolean hasTeen ( int num, int num1, int num2) {
		if ( ( num < 13 || num > 19) && ( num1 < 13 || num1 > 19) && ( num2 < 13 || num2 > 19)) {
			return false;
		} else if ( (num >= 13 || num <= 19) || (num1 >= 13 || num1 <= 19) || (num2 >= 13 || num2 <= 19)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isTeen ( int newNum) {
		if ( newNum < 13 || newNum > 19) {
			return false;
		} else if ( newNum >= 13 || newNum <= 19) {
			return true;
		} else {
			return false;
		}
	}

}
