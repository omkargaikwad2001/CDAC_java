package util;

import java.io.PrintWriter;

public class Printable implements Runnable{

	private int n;
	
	private PrintFact p;
	
	private PrintWriter pw;
	
	private Thread t;
	
	
	
	public Printable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Printable(int n, PrintFact p,PrintWriter pw) {
		super();
		this.n = n;
		this.p = p;
		this.pw=pw;
		this.t = new Thread(this);
	}

	
	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		p.print(n,pw);
	}
	
	

}
