package app;

import staff.Admin;
import staff.Programmer;
import staff.SalesManager;
import utility.Employee;

public class Main {
	
	public static void showMoreDetails(Employee[] allEmp) {
		
		double totalSalToPay=0.0f;
		
		for(Employee e:allEmp) {
			System.out.println(e);
			if(e instanceof SalesManager) {
			 System.out.println(((SalesManager) e).getTarget());
			}
			
			if(e instanceof Programmer) {
				System.out.println(((Programmer) e).getTitle());
			}
			
			if(e instanceof Admin) {
				System.out.println(((Admin) e).getAllowance());
			}
			totalSalToPay+=e.calculateSalary();
			System.out.println("Gross Salary = "+e.calculateSalary());
			System.out.println();
		}
		System.out.println("Total Salary to pay = "+totalSalToPay);
		
	}

	public static void main(String[] args) {
				
		Employee [] allEmp = new Employee[3];
		allEmp[0]=new SalesManager(50,1000,101,50000,"Emp1",30,1,1,1111);
		allEmp[1]=new Programmer("Java Project",8,1000,102,50000,"Emp2",40,2,2,2222);
		allEmp[2]=new Admin(2000,103,50000,"Emp3",40,3,3,3333);
		
		showMoreDetails(allEmp);

	}

}
