package util;

public class MyRunnable implements Runnable{
	
	private int start;
	private int end;
	
	private Thread t;

	public MyRunnable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyRunnable(int start, int end) {
		super();
		this.start = start;
		this.end = end;
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
		
		for(int i=start;i<=end;i++) {
			if(i==1 || i<0) {
				continue;
			}
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			
			if(flag) {
				System.out.println(i);
			}
		}
		
	}
	

}
