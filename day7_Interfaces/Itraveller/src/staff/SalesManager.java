package staff;

import utility.Employee;
import utility.ITraveller;

public class SalesManager extends Employee implements ITraveller{

	private double target;
	private double commission;
	private String passportNumber;
	private int travelHours;
	
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SalesManager(double target, double commission,String passportNumber,int travelHours,int empId, double salary, String name, int age, int dd, int mm, int yy) {
		super(empId, salary, name, age, dd, mm, yy);
		this.target = target;
		this.commission = commission;
		this.passportNumber=passportNumber;
		this.travelHours=travelHours;
		
	}
	
	public void display() {
		super.display();
		System.out.println("Sales Manager Target = "+target);
		System.out.println("Sales Commission = "+commission);
		System.out.println("Sales Manager Passport number = "+passportNumber);
		System.out.println("Sales Manager Traver Hours = "+travelHours);
		System.out.println("*******************");
	}
	
	public double calculateSalary() {
//		System.out.println("SalesManager salary called...");
		return super.calculateSalary() + (target*commission);
	}

	@Override
	public String toString() {
		return super.toString()+"SalesManager [target=" + target + ", commission=" + commission + "]";
	}

	@Override
	public String getPassportDetails() {
		return passportNumber;
	}

	@Override
	public int getTraverHours() {
		return travelHours;
	}
	
	
	
	
	
	
	
	
}
