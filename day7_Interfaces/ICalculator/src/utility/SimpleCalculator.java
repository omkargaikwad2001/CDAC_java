package utility;

public class SimpleCalculator implements ICalculator{

	@Override
	public double add(float a, float b) {
		return a+b;
	}

	@Override
	public double sub(float a, float b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(float a, float b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(float a, float b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
