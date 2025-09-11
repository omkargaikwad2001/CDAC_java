package logical;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0, i = 0;

        while (binary != 0) {
            int digit = binary % 10; 
            decimal += digit * Math.pow(2, i); 
            binary = binary / 10; 
            i++;
        }

        System.out.println("Decimal value = " + decimal);

        sc.close();
    }
}
