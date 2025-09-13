package app;

import java.util.Scanner;
import util.Password;

public class ExceptionPwdMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password:");
        String passwordInput = sc.nextLine();

        try {
            Password p = new Password(passwordInput);
            System.out.println("Password accepted " + p);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("End...");
        
        sc.close();
    }
}
