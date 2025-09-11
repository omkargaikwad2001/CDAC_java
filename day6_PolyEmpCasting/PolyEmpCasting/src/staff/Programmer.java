package staff;

import utility.Employee;

public class Programmer extends Employee{
	
	private String projectTitle;
	private int extraHour;
	private double chargesPerHour;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Programmer(String projectTitle,int extraHour,double chargesPerHour,int empId, double salary, String name, int age, int dd, int mm, int yy) {
		super(empId, salary, name, age, dd, mm, yy);
		this.projectTitle = projectTitle;
		this.extraHour = extraHour;
		this.chargesPerHour = chargesPerHour;
	}
	
	public void display() {
		super.display();
		System.out.println("Progranner Project Title = "+projectTitle);
		System.out.println("Progranner Extra Hour = "+extraHour);
		System.out.println("Progranner ChargesPerHour = "+chargesPerHour);
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
	
	public String getTitle() {
		return projectTitle;
	}
	
	

}
