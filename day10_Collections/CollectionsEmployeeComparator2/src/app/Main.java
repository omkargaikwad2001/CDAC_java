package app;

import java.util.Set;
import java.util.TreeSet;

import util.Employee;

public class Main {

	public static void main(String[] args) {
		
		Set<Employee> e = new TreeSet<>(new Employee());
		e.add(new Employee(207, "Omkar",   14560.75f, "IT"));
		e.add(new Employee(115, "Aarav",    9820.40f, "HR"));
		e.add(new Employee(119, "Aarav",    19820.40f, "HR"));
		e.add(new Employee(116, "Parav",    19820.40f, "HR"));
		e.add(new Employee(117, "Aarav",    19820.40f, "HR"));
		e.add(new Employee(389, "Neha",    17650.10f, "Finance"));
		e.add(new Employee(241, "Rohan",    7325.55f, "IT"));
		e.add(new Employee(523, "Priya",   15480.25f, "Marketing"));
		e.add(new Employee(198, "Kiran",    8670.90f, "Admin"));
		e.add(new Employee(342, "Meera",   11230.35f, "Finance"));
		e.add(new Employee(459, "Aditya",  13200.60f, "IT"));
		e.add(new Employee(276, "Sneha",    9150.20f, "HR"));
		e.add(new Employee(631, "Vikram",  12475.80f, "Sales"));
		
		System.out.println(e);

	}

}
