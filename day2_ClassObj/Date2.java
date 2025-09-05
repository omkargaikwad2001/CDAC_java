public class Date2{

	private int dd2;
	private int mm2;
	private int yy2;
	
	//default const
	public Date2(){
		dd2=0;
		mm2=0;
		yy2=0;
	}

	//para const
	public Date2(int dd2,int mm2,int yy2){
		this.dd2=dd2;
		this.mm2=mm2;
		this.yy2=yy2;
	}

	void setDay(int dd2){
		this.dd2=dd2;
	}

	void setMonth(int mm2){
		this.mm2=mm2;
	}

	void setYear(int yy2){
		this.yy2=yy2;
	}

	int getDay(){
		return dd2;
	}

	int getMonth(){
		return mm2;
	}

	int getYear(){
		return yy2;
	}

	void getDate(){
		System.out.println(dd2+"/"+mm2+"/"+yy2);
	}	

	public static void main(String[] args){
		
		Date2 d1 = new Date2();
		d1.getDate();

		d1.setDay(5);
		d1.setMonth(9);
		d1.setYear(2025);

		System.out.println("Day = "+d1.getDay());
		System.out.println("Month = "+d1.getMonth());
		System.out.println("Year = "+d1.getYear());

		d1.getDate();
		
	}

}