package utility;

import java.io.Serializable;

public class Date implements Serializable {
	
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		super();
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	@Override
	public String toString() {
		return "Date of Birth: " +
			   + dd +"/"+ mm +"/"+ yy + "\n";
	}
}
