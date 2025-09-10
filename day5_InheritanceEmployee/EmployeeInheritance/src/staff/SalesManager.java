package staff;

import utility.Employee;

public class SalesManager extends Employee{

	private double target;
	private double commission;
	
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SalesManager(double target, double commission,int empId, double salary, String name, int age, int dd, int mm, int yy) {
		super(empId, salary, name, age, dd, mm, yy);
		this.target = target;
		this.commission = commission;
	}
	
	public void display() {
		super.display();
		System.out.println("Sales Manager Target = "+target);
		System.out.println("Sales Commission = "+commission);
		System.out.println("*******************");
	}
	
	
	
	
	
	
}
