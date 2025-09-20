package util;

public class MyRunnable implements Runnable{

	private Thread t;
	private String name;
	
	public Thread getT() {
		return t;
	}
	
	public MyRunnable(String name) {
		this.name=name;
		t = new Thread(this);
	}
	
	@Override
	public void run() {
		
		for(int i=10;i>=1;i--) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
}
