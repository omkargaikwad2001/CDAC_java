package util;

public class Employee implements Comparable<Employee>{
	
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		if(this.salary>o.salary) {
			if(this.salary==o.salary) {
				return 0;
			}
			return 1;
		}
		
		return -1;
		
	}
	

}
