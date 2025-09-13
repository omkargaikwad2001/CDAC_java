package app;

import java.util.Scanner;
import util.InvalidName;
import util.InvalidUserNameException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter First name: ");
            String fname = sc.nextLine();

            System.out.print("Enter Last name: ");
            String lname = sc.nextLine();

            new InvalidName().validateUserName(fname, lname);

        } catch (InvalidUserNameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
