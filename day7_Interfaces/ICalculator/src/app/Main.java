package app;

import utility.ICalculator;
import utility.SimpleCalculator;

public class Main {

	public static void main(String[] args) {
		
//		SimpleCalculator s = new SimpleCalculator();
		
		ICalculator s = new SimpleCalculator();
		
		System.out.println("Addition = "+s.add(10,2));
		System.out.println("Subtraction = "+s.sub(10,2));
		System.out.println("Multiplication = "+s.mul(10,2));
		System.out.println("Division = "+s.div(10,2));
	
	}

}
