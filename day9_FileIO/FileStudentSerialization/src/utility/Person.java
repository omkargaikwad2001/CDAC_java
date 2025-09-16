package utility;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private Date bdate;
	
	public Person() {
		bdate = new Date();
	}
	
	public Person(String name, int dd,int mm,int yy) {
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	@Override
	public String toString() {
		return "Person Details:\n" +
		       "Name : " + name + "\n" +
		       bdate; 
	}
}
