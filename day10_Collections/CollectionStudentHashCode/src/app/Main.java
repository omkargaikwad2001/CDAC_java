package app;

import java.util.HashSet;
import java.util.Set;

import utility.Students;

public class Main {

	public static void main(String[] args) {
		
		Set<Students> s = new HashSet<>();
		s.add(new Students(104, "Omkar", "Pune", 89.78f));
		s.add(new Students(104, "Omkar", "Pune", 89.78f));
		s.add(new Students(104, "Omkar", "Pune", 89.78f));
		s.add(new Students(102, "Aarav", "Mumbai", 76.45f));
		s.add(new Students(103, "Neha", "Delhi", 92.30f));
		s.add(new Students(101, "Rohan", "Bangalore", 68.90f));
		s.add(new Students(104, "Omkar", "Pune", 81.15f));
		s.add(new Students(10, "Kiran", "Delhi", 74.25f));
		s.add(new Students(107, "Meera", "Bangalore", 95.60f));
		s.add(new Students(105, "Aditya", "Pune", 59.80f));
		s.add(new Students(109, "Sneha", "Pune", 88.40f));
		s.add(new Students(106, "Vikram", "Bangalore", 72.00f));
		
		System.out.println(s);

	}

}
