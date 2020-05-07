package codingExercises;




public class AreaCalculator {
	
	public static double area(double radius) {
		
		if ( radius < 0) {
			return -1;
		
		}
		double pi = Math.PI;
		double areaOfCircle = radius * radius * pi;
		return areaOfCircle;
		
	}
	
	public static double area( double x, double y) {
		if ( x < 0 || y < 0 || (x < 0) && (y < 0)) {
			return -1; 
			
		}
		double areaOfRectangle = x * y;
		return areaOfRectangle; 
	}

}
