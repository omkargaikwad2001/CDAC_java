package app;

import java.util.LinkedHashSet;
import java.util.Set;

import util.Customer;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Customer> s = new LinkedHashSet<Customer>();
		 	s.add(new Customer("Omkar", 101));
		 	s.add(new Customer("Omkar", 101));
	        s.add(new Customer("Aarav", 102));
	        s.add(new Customer("Priya", 103));
	        s.add(new Customer("Rohan", 104));
	        s.add(new Customer("Rohan", 104));
	        s.add(new Customer("Rohan", 104));
	        s.add(new Customer("Sneha", 105));
	        s.add(new Customer("Vikas", 106));
	        s.add(new Customer("Neha", 107));
	        s.add(new Customer("Neha", 107));
	        s.add(new Customer("Anuj", 108));
	        s.add(new Customer("Pooja", 109));
	        s.add(new Customer("Rahul", 110));
		
	        System.out.println(s);
		
	}

}
