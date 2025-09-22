package util;

public class Printer {
	
	public synchronized void print(String header, String body, String footer) {
		System.out.println(header);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(body);
		System.out.println(footer);
		
	}

}
