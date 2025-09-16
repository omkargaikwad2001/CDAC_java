package utility;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;
	private int age;
	private Date bdate;
	
	public Person() {
		bdate = new Date();
	}
	
	public Person(String name, int age, int dd,int mm,int yy) {
		this.name = name;
		this.age = age;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		bdate.display();
	}
	
	
}
