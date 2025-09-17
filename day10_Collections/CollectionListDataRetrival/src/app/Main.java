package app;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utility.Customer;
import utility.RegCustomer;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		List<Customer> list = new ArrayList<Customer>();
		
		
		for(int i=0;i<5;i++) {			
			System.out.println("Enter 1 to store data for Customer and 2 for RegCustomer");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				Customer c = new Customer();
				c.accept();
				list.add(c);
				break;
				
			case 2:
				RegCustomer r = new RegCustomer();
				r.accept();
				list.add(r);
				break;
				
			default:
				System.out.println("Invalid input...");
			
			}
		
		}
		
		
		System.out.println("Customer details");
		for(Customer c: list) {
			System.out.println(c);
		}
		
		FileOutputStream fos = new FileOutputStream("demo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("Serializing data...");
		for(Customer c:list) {
			oos.writeObject(c);
		}
		System.out.println("Data added to file...");
		
		
		System.out.println("Deserializing data and saving into 2 diff lists...");
		FileInputStream fis = new FileInputStream("demo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Customer> c1 = new ArrayList<Customer>();
		List<RegCustomer> r1 = new ArrayList<RegCustomer>();
		
		while(true) {
			try {
				
				Object obj = ois.readObject();
				if (obj instanceof RegCustomer) {      
                    r1.add((RegCustomer) obj);
                } else if (obj instanceof Customer) {
                    c1.add((Customer) obj);
                }
				
			}catch(EOFException e){
				break;
			}
		}
		
		System.out.println("Prnting data of Customer using Customer list");
		System.out.println(c1);
		
		System.out.println("Prnting data of RegCustomer using Customer list");
		System.out.println(r1);
		
	}

}
