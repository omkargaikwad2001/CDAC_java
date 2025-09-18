package app;

import java.util.Set;
import java.util.TreeSet;

import util.Employee;

public class Main {

	public static void main(String[] args) {
		
		Set<Employee> e = new TreeSet<>();
		e.add(new Employee(56.56f));
		e.add(new Employee(56.56f));
		e.add(new Employee(56.56f));
		e.add(new Employee(89.12f));
		e.add(new Employee(47.12f));
		e.add(new Employee(36.96f));
		e.add(new Employee(43.28f));
		e.add(new Employee(89.45f));
		e.add(new Employee(52.37f));
		
		System.out.println(e);

	}

}
