package Gherardi.Joseph.Chapter7.Java.Project;

public class SimpleMath {

	public double divide(double numerator, double denominator) {
		if(denominator == 0) { 
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		double result = (numerator/denominator);
		
		
		System.out.println(result);
		
		return result;
	}
	public double multiply(double n1, double n2) {
		double answer = (n1*n2);
		System.out.println(answer);
		return answer;
	}
	
	
	
	
}
