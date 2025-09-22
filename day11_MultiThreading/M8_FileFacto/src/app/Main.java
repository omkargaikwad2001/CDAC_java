package app;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import util.PrintFact;
import util.Printable;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Main Started...");
		
		PrintWriter pw = new PrintWriter("demo.txt");
		
		
		PrintFact p = new PrintFact();
		
		Printable p1 = new Printable(50,p,pw);
		Printable p2 = new Printable(60,p,pw);
		Printable p3 = new Printable(70,p,pw);
		Printable p4 = new Printable(80,p,pw);
		
		
		p1.getT().start();
		p2.getT().start();
		p3.getT().start();
		p4.getT().start();
		
		try {
			p1.getT().join();
			p2.getT().join();
			p3.getT().join();
			p4.getT().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.close();
		System.out.println("Main ended...");
	}

}
