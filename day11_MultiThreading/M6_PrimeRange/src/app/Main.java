package app;

import util.MyRunnable;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		MyRunnable r = new MyRunnable(1,20);
		r.getT().start();
		System.out.println("Main ended...");

	}

}
