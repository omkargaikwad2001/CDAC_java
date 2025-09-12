package app;

import java.util.Scanner;

import util.AdvanceIntOperations;
import util.BasicIntOperations;
import util.MyNumber;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter 1 for Basic ops and 2 for adv Ops");
    	int n = sc.nextInt();
    	
    	switch(n) {
    	case 1:
    		System.out.println("Basics ops called");
    		BasicIntOperations b1 = new MyNumber();
            System.out.println("Is 10 even? " + b1.isEven(10));
            System.out.println("Is 3 odd? " + b1.isOdd(3));
            break;
    	case 2:
    		System.out.println("Advance ops called");
            AdvanceIntOperations a1 = new MyNumber();
            System.out.println("Is 57 prime? " + a1.isPrime(57));
            System.out.println("Factorial of 5 = " + a1.calFactorial(5));
            break;
    	default:
    		System.out.println("Invalid Input Enter 1/2");
    	}

    }
}
