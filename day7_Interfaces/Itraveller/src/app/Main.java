package app;

import staff.Admin;
import staff.Programmer;
import staff.SalesManager;
import utility.Employee;
import utility.ITraveller;

public class Main {
	
	public static void getDeatails(Employee[] allEmp) {
		
		double totalSalToPay=0.0f;
		int totalTraverHours=0;
		for(Employee e:allEmp) {
			if(e instanceof ITraveller) {
				System.out.println(e+" Gross Salary = "+e.calculateSalary());
				System.out.println("Passport Number = "+((ITraveller)e).getPassportDetails());
				System.out.println("Travel Hours = "+((ITraveller)e).getTraverHours());
				totalTraverHours+=((ITraveller) e).getTraverHours();
				System.out.println();
			}
			totalSalToPay+=e.calculateSalary();
			
		}
		
		System.out.println("Total Salary to pay = "+totalSalToPay);
		System.out.println("Total Travel Hours = "+totalTraverHours);

}
		

	public static void main(String[] args) {
		
		Employee [] allEmp = new Employee[3];
		allEmp[0]=new SalesManager(50,1000,"AGFNYTAWOFH123",100,101,50000,"Emp1",30,1,1,1111);
		allEmp[1]=new Programmer("Java Project",8,1000,"OIGFBJJ78",200,102,50000,"Emp2",40,2,2,2222);
		allEmp[2]=new Admin(2000,103,50000,"Emp3",40,3,3,3333);
		
		getDeatails(allEmp);

	}
}