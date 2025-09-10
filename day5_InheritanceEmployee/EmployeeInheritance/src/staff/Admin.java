package staff;

import utility.Employee;

public class Admin extends Employee{
	
	private double allowance;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(double allowance, int empId, double salary, String name, int age, int dd, int mm, int yy) {
		super(empId, salary, name, age, dd, mm, yy);
		this.allowance = allowance;
	}

	public void display() {
		super.display();
		System.out.println("Admin allowance = "+allowance);
		System.out.println("*******************");
	}
	
}
