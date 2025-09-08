public class Date{

	private int dd;
	private int mm;
	private int yy;

	public static int count=0;
	
	//default const
	public Date(){
		count++;
		dd=0;
		mm=0;
		yy=0;
	}

	//para const
	public Date(int dd,int mm,int yy){
		count++;
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	//overloaded copy
	public Date(Date d){
		count++;
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}

	void setDate(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	void getDate(){
		System.out.println(dd+"/"+mm+"/"+yy);
		System.out.println("Object Count = "+getCount());
		System.out.println();
	}

	public int getCount(){
		return count;
	}		
}