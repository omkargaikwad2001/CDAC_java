public class Date{

	private int dd;
	private int mm;
	private int yy;
	
	//default const
	public Date(){
		dd=0;
		mm=0;
		yy=0;
	}

	//para const
	public Date(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	//overloaded copy
	public Date(Date d){
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}

	void setDate(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	boolean isLeapYear(){
		if((this.yy % 4 == 0) && (this.yy % 400 == 0 || this.yy % 100!=0)){
			return true;
		}
		return false;
	}

	void getDate(){
		System.out.println(dd+"/"+mm+"/"+yy);
	}	

	public static void main(String[] args){
		
		Date d1 = new Date();
		d1.getDate();
		Date d2 = new Date(1,1,2024);
		d2.getDate();
		Date d3 = new Date(d2);
		d3.getDate();
		
		if(d2.isLeapYear()){
			System.out.println("This is leap year");
		}
		else{
			System.out.println("This is not leap year");
		}
	}
}