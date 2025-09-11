package app;

import staff.Admin;
import staff.Programmer;
import staff.SalesManager;
import utility.Employee;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("SalesManager Details");
//		SalesManager s1 = new SalesManager(50,1000,101,50000,"Emp1",30,1,1,1111);
//		s1.display();
//		System.out.println();
//		
//		System.out.println("Programmer Details");
//		Programmer p1 = new Programmer("Java Project",8,1000,102,50000,"Emp2",40,2,2,2222);
//		p1.display();
//		System.out.println();
//		
//		System.out.println("Admin Details");
//		Admin a1 = new Admin(2000,103,50000,"Emp3",40,3,3,3333);
//		a1.display();
//		System.out.println();
		
		Employee [] allEmp = new Employee[3];
		allEmp[0]=new SalesManager(50,1000,101,50000,"Emp1",30,1,1,1111);
		allEmp[1]=new Programmer("Java Project",8,1000,102,50000,"Emp2",40,2,2,2222);
		allEmp[2]=new Admin(2000,103,50000,"Emp3",40,3,3,3333);
		
		double totalSalToPay=0.0f;
		for(Employee e:allEmp) {
			System.out.print(e+" Gross Salary = "+e.calculateSalary());
			totalSalToPay+=e.calculateSalary();
		}
		
		System.out.println("Total Salary to pay = "+totalSalToPay);

	}

}
