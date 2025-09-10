package utility;

public class Date {
	
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display() {
		System.out.println("DOB = "+dd+"/"+mm+"/"+yy);
	}
	
}
