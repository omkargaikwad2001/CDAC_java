package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MyRunnable implements Runnable{
	
	private String source;
	private String destination;
	
	private Thread t;

	public MyRunnable() {
		super();
		t = new Thread(this);
	}


	public MyRunnable(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
		t = new Thread(this);
	}




	public Thread getT() {
		return t;
	}


	public void setT(Thread t) {
		this.t = t;
	}


	@Override
	public void run() {
		System.out.println("Child Thread Started...");
		
		for(int i=1;i<=50;i++) {
        	System.out.println("This is Child = "+i);
        }
		
		PrintWriter pw=null;
        BufferedReader br=null;
        try {
//        		pw = new PrintWriter(source);
//        		br = new BufferedReader(new InputStreamReader(System.in));
//        		String str;
//        		System.out.println("Enter data to file and Enter stop to exit");
//        		while(!(str=br.readLine()).equals("stop")) {
//        			pw.println(str);
//        		}
        		
//        		System.out.println("Data inserted to file...");
//        		pw.close();
        		String str;
        		System.out.println("Reading data from file...");
        		br = new BufferedReader(new FileReader(source));
        		pw = new PrintWriter(destination);
        		while((str=br.readLine())!=null) {
//        			System.out.println(str);
        			pw.println(str);
        		}
        		System.out.println("Data Inserted to destination...");
        		
        		
        }catch(Exception e) {
        		e.printStackTrace();
        	
        }finally {
			pw.close();
		}

		System.out.println("Child Thread Ended...");	
	}
		

}
