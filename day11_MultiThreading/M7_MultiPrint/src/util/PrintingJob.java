package util;

public class PrintingJob implements Runnable{

	private String header;
	private String body;
	private String footer;
	
	private Printer p;
	
	private Thread t;
	
	
	public PrintingJob() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrintingJob(String header, String body, String footer, Printer p) {
		super();
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.t = new Thread(this);
		this.p=p;
	}
	
	@Override
	public void run() {
		p.print(header, body, footer);
	}
	
	public Thread getT() {
		return t;
	}

}
