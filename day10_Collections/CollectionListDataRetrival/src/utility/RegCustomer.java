package utility;

import java.io.Serializable;
import java.util.Scanner;

public class RegCustomer extends Customer implements Serializable{
	
	transient Scanner sc = new Scanner(System.in);
	
	private long regno;

	public RegCustomer() {
		super();
	}

	public RegCustomer(String name, String email, long contact,long regno) {
		super(name, email, contact);
		this.regno = regno;
		
	}
	
	public void accept() {
		
		System.out.println("Enter name of customer ");
		name = sc.nextLine();
		
		System.out.println("Enter email of customer");
		email = sc.nextLine();
		
		System.out.println("Enter contact number");
		contact = sc.nextLong();
		
		System.out.println("Enter reg num");
		regno = sc.nextLong();
		
	}
	
	public void display() {
		
		System.out.println("Name = "+name);
		System.out.println("Email = "+email);
		System.out.println("Contact = "+contact);
		System.out.println("Reg num = "+regno);
		System.out.println();
	}


	@Override
	public String toString() {
		return super.toString()+"RegCustomer [regno=" + regno + "]";
	}
	
	

}
