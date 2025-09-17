package utility;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable{
	
	protected String name;
	protected String email;
	protected long contact;
	
	transient Scanner sc = new Scanner(System.in);
	
	public Customer() {
		super();
	}

	public Customer(String name, String email, long contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	
	public void accept() {
		
		System.out.println("Enter name of customer ");
		name = sc.nextLine();
		
		System.out.println("Enter email of customer");
		email = sc.nextLine();
		
		System.out.println("Enter contact number");
		contact = sc.nextLong();
	
	}
	
	public void display() {
		
		System.out.println("Name = "+name);
		System.out.println("Email = "+email);
		System.out.println("Contact = "+contact);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	

}
