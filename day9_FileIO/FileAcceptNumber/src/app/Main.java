package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        System.out.println("Enter numbers to find their factors (type 'quit' to exit):");

        try {
            while (true) {
                System.out.print("Enter number: ");
                input = br.readLine();

                if (input.equalsIgnoreCase("quit")) {
                    System.out.println("Program terminated.");
                    break;
                }

                try {
                    int num = Integer.parseInt(input);

                    String factors = "";
                    for (int i = 1; i <= num; i++) {
                        if (num % i == 0) {
                            if (factors.equals("")) {
                                factors = String.valueOf(i);  
                            } else {
                                factors += "," + i;  
                            }
                        }
                    }

                    System.out.println("Factors of " + num + " = " + factors);

                } catch (NumberFormatException e) {
                    System.out.println("Not a number");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
