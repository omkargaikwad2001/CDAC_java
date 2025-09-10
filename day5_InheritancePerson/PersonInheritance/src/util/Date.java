package util;

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
	
	public Date(Date obj) {
		super();
		this.dd = obj.dd;
		this.mm = obj.mm;
		this.yy = obj.yy;
	}
	
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}

}
