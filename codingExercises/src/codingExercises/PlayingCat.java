package codingExercises;

public class PlayingCat {
	
	public static boolean isCatPlaying(boolean summer, int temperture) {
		if ((summer != true && (temperture < 25 || temperture > 35)) || (summer == true && (temperture < 25 || temperture > 45)) ) {
			return false;
		} else {
			if ( summer != true && ( temperture >= 25 || temperture <= 35 )) {
				return true;
			} else {
				if ( summer == true && ( temperture >= 25 || temperture <= 45 )) {
					return true;
					} else {
						return false;
					}
			}
		}
	}
}
		
