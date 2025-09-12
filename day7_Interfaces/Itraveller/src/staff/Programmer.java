package staff;

import utility.Employee;
import utility.ITraveller;

public class Programmer extends Employee implements ITraveller{
	
	private String projectTitle;
	private int extraHour;
	private double chargesPerHour;
	private String passportNumber;
	private int travelHours;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Programmer(String projectTitle,int extraHour,double chargesPerHour,String passportNumber,int travelHours,int empId, double salary, String name, int age, int dd, int mm, int yy) {
		super(empId, salary, name, age, dd, mm, yy);
		this.projectTitle = projectTitle;
		this.extraHour = extraHour;
		this.chargesPerHour = chargesPerHour;
		this.passportNumber=passportNumber;
		this.travelHours=travelHours;
	}
	
	public void display() {
		super.display();
		System.out.println("Programmer Project Title = "+projectTitle);
		System.out.println("Programmer Extra Hour = "+extraHour);
		System.out.println("Programmer ChargesPerHour = "+chargesPerHour);
		System.out.println("Programmer Passport Number = "+passportNumber);
		System.out.println("Programme Travel Houes = "+travelHours);
		System.out.println("*******************");
	}
	
	public double calculateSalary() {
//		System.out.println("Programmer salary called...");
		return super.calculateSalary()+(extraHour*chargesPerHour);
	}

	@Override
	public String toString() {
		return super.toString()+"Programmer [projectTitle=" + projectTitle + ", extraHour=" + extraHour + ", chargesPerHour="
				+ chargesPerHour + "]";
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
