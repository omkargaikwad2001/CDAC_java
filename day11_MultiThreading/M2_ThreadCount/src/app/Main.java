package app;

import util.MyRunnable;
import util.MyThread;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
//		MyThread t = new MyThread();
//		t.start();
		
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main Ended...");
			
	}

}
