package utility;

public class Employee extends Person{
	
	private int empId;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, double salary, String name, int age, int dd,int mm,int yy) {
		super(name,age,dd,mm,yy);
		this.empId = empId;
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		System.out.println("EmpID = "+empId);
		System.out.println("Emp Salary = "+salary);
		
	}
	
	public double calculateSalary() {
//		System.out.println("Emp salary called...");
		return salary;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [empId=" + empId + ", salary=" + salary + "]";
	}
	
	
	

}
