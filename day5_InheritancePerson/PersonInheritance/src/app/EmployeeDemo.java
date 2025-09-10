package app;

import util.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.display();
		
		Employee e2 = new Employee(101,50000,"Omkar",25,4,5,2001);
		e2.display();

	}

}
