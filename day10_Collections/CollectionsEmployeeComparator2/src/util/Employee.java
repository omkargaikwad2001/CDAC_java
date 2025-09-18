package util;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	private int eid;
	private String name;
	private double salary;
	private String dept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, double salary, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "\nEmployee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
	    
	    int deptCompare = o1.dept.compareToIgnoreCase(o2.dept);
	    if (deptCompare != 0) {
	        return deptCompare;
	    }

	    int salaryCompare = Double.compare(o2.salary, o1.salary); 
	    if (salaryCompare != 0) {
	        return salaryCompare;
	    }

	    int nameCompare = o1.name.compareToIgnoreCase(o2.name);
	    if (nameCompare != 0) {
	        return nameCompare;
	    }

	    return Integer.compare(o1.eid, o2.eid);
	}

	
	

}
