package app;

import util.MyRunnable;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Started...");
		
		MyRunnable r1 = new MyRunnable("T1");
		MyRunnable r2 = new MyRunnable("T2");
		MyRunnable r3 = new MyRunnable("T3");
		
		r1.getT().start();
		r2.getT().start();
		r3.getT().start();
		
		try {
			
			r1.getT().join();
			r2.getT().join();
			r3.getT().join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Ended...");
		
	}

}
