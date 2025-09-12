package app;

import utility.IScientificCalculator;
import utility.ScientificCalculator;

public class Main {

	public static void main(String[] args) {
		
		IScientificCalculator calc = new ScientificCalculator();
		
		System.out.println("Addition = " + calc.add(10, 2));
		System.out.println("Subtraction = " + calc.sub(10, 2));
		System.out.println("Multiplication = " + calc.mul(10, 2));
		System.out.println("Division = " + calc.div(10, 2));

		double angle = Math.toRadians(30);
		System.out.println("\nTrigonometric Functions (30 degrees):");
		System.out.println("sin(30°) = " + calc.sin(angle));
		System.out.println("cos(30°) = " + calc.cos(angle));
		System.out.println("tan(30°) = " + calc.tan(angle));
	}
}
