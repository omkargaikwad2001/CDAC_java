package app;

import java.util.Scanner;
import util.PasswordValidator;
import util.InvalidPwdException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        try {
            PasswordValidator.checkPwd(pwd);
        } catch (InvalidPwdException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }

        sc.close();
    }
}
