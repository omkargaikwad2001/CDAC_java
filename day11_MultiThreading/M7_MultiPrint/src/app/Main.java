package app;

import util.Printer;
import util.PrintingJob;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		
		Printer p = new Printer();
		
		PrintingJob j1 = new PrintingJob("{","Welcome","}",p);
		PrintingJob j2 = new PrintingJob("{","java","}",p);
		PrintingJob j3 = new PrintingJob("{","CPP","}",p);
		
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Ended...");
	}

}
