package utility;

public class ScientificCalculator implements IScientificCalculator {

	@Override
	public double add(float a, float b) {
		return a + b;
	}

	@Override
	public double sub(float a, float b) {
		return a - b;
	}

	@Override
	public double mul(float a, float b) {
		return a * b;
	}

	@Override
	public double div(float a, float b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero not allowed!");
		}
		return a / b;
	}

	@Override
	public double sin(double angle) {
		return Math.sin(angle);
	}

	@Override
	public double cos(double angle) {
		return Math.cos(angle);
	}

	@Override
	public double tan(double angle) {
		return Math.tan(angle);
	}
}
