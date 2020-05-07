
public class EqualSumChecker {
	
	
	public static boolean hasEqualSum ( int num, int num2, int num3) {
		
		int sumNum = num + num2;
		
		if ( sumNum == num3) {
			return true;
		} else {
			return false;
		}
	}

}
