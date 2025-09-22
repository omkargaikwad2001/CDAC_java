package util;

import java.io.PrintWriter;

public class PrintFact {
	
	public synchronized void print(int n, PrintWriter pw) {
		pw.println("Factorials of "+n);
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(n%i==0) {
//				System.out.print(i+" ");
				pw.print(i+" ");
			}
		}
		pw.println();
	}

}
