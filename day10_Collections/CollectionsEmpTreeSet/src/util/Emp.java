package util;

public class Emp{
	
	private double salary;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(double salary) {
		super();
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "\nsalary=" + salary;
	}

}
