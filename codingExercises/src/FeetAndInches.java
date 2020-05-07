
public class FeetAndInches {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		calcFeetAndInchesToCentimeters(157);

	}
	
	public static double calcFeetAndInchesToCentimeters( double feet, double inches) {
		
		if ( ( feet < 0)  || ( (inches < 0) || (inches > 12))) {
			System.out.println(" invalid feet or inches");
			return -1;
		} 
			 double feetToInches = feet * 12; 
			 double centimeters =  (feetToInches + inches) * 2.54 ;
			 System.out.println( feet + " Ft " + inches + " In = " + centimeters + "Cm");
			 return centimeters;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if ( inches < 0) {
			System.out.println("invalid inches");
			return -1;
		} 
			double feet =   (int) inches / 12;
			double remainderInches = (int) inches % 12;
			System.out.println(inches + " inches = " + feet + " Ft and " + remainderInches + " inches");
			return calcFeetAndInchesToCentimeters(feet, remainderInches);
			
	
	}

}
