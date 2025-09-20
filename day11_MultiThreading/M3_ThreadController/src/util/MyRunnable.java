package util;

public class MyRunnable implements Runnable {

	private Thread t;

	public Thread getT() {
		return t;
	}

	public MyRunnable() {
		t = new Thread(this);
	}

	@Override
	public void run() {
		System.out.println("Child Started...");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child Ended...");
	}

}
