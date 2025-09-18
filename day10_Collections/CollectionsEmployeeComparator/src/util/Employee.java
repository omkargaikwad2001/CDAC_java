package util;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
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
	public int compare(Employee o1, Employee o2) {
	    if (o1.salary > o2.salary) {
	        return 1;
	    } else if (o1.salary < o2.salary) {
	        return -1;
	    } else {
	        return 0;
	    }
	}

	

}
