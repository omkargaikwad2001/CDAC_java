public class CalculatorDemo{
	
	public static void main(String[] args){
		

		Calculator c1 = new Calculator(20,10);
				
		System.out.println("Addition = "+c1.add());
		System.out.println("Subtraction = "+c1.sub());
		System.out.println("Multiplication = "+c1.mul());
		System.out.println("Division = "+c1.div());
	}

}