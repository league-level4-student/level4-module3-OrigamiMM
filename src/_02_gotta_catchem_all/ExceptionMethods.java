package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double num, double den) throws IllegalArgumentException{
		double quotient;
		if(den == 0.0) {
			throw new IllegalArgumentException();
		}else {
		quotient = num/den;
		}
		return quotient;
	}
	String reverseString(String str) throws IllegalStateException{
		String rString = "";
		if(str.isEmpty()) {
			throw new IllegalStateException();
		}else {
			for (int i = str.length(); i > 0; i++) {
				rString += str.charAt(i);
			}
		}
		return rString;
	}
	
}
