package app;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import util.Emp;

public class Main {

	public static void main(String[] args) {
		
//		Set<Emp> e = new TreeSet<Emp>(new Comparator<Emp>() {
//
//			@Override
//			public int compare(Emp o1, Emp o2) {
////				return Double.compare(o1.getSalary(), o2.getSalary());
//				if(o1.getSalary()>o2.getSalary()) {
//					return 1;
//				}
//				return -1;
//			}
//		
//		});
		
		Set<Emp> e = new TreeSet<Emp>((e1,e2)->{
			if(e1.getSalary()>e2.getSalary()) return 1;
			else if(e1.getSalary()<e2.getSalary()) return -1;
			else return 0;
		});
		
		e.add(new Emp(565.78));
		e.add(new Emp(565.78));
		e.add(new Emp(565.78));
		e.add(new Emp(1278.89));
		e.add(new Emp(25.78));
		e.add(new Emp(9632.23));
		e.add(new Emp(854.25));
		e.add(new Emp(75.23));
		e.add(new Emp(963.58));
		e.add(new Emp(45.25));
		System.out.println(e);

	}

}
