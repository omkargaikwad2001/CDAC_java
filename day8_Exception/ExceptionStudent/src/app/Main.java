package app;

import java.util.Scanner;

import util.UserRegistration;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter name : ");
			String name = sc.nextLine();
			System.out.println("Enter Country : ");
			String county = sc.nextLine();
			UserRegistration user = new UserRegistration();
			user.registerUser(name, county);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Flow continue...");

		sc.close();
	}

}
