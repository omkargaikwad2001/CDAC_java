package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program started...");

        try {
        	
        	if(args.length!=3) {
        		throw new ArrayIndexOutOfBoundsException();
        	}
        	
        	try {
        		int n1 = Integer.parseInt(args[0]);
        		int n2 = Integer.parseInt(args[1]);
        		char ch = args[2].charAt(0);
        		
        		if(n1==0 || n2==0) {
        			throw new ArithmeticException();
        		}
        		
        		switch(ch) {
        		case '+':
        			System.out.println("Addition = "+(n1+n2));
        			break;
        			
        		case '-':
        			System.out.println("Subtraction = "+(n1-n2));
        			break;
        			
        		case '*':
        			System.out.println("Multiplication = "+(n1*n2));
        			break;
        			
        		case '/':
        			System.out.println("Division = "+(n1/n2));
        			break;
        		default:
        			System.out.println("Invalid operator...");
        		}
        		
        		
        	}catch(NumberFormatException e) {
        		System.out.println(e+" First two numbers are not valid");
        	}catch(ArithmeticException e) {
        		System.out.println(e+" number cannot be 0");
        	}
        	
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e+" insufficient arguments or more than 3 argument are provided required are 3");
        }
        finally {
        	System.out.println("Done...");
        }
        
        System.out.println("Flow continued.");
    }
}
