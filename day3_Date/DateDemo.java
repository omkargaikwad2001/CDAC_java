public class DateDemo{
	
	public static void main(String[] args){
		
		Date d1 = new Date();
		d1.getDate();
		
		Date d2 = new Date(1,1,2024);
		d2.getDate();	

		Date d3 = new Date(d2);
		d3.getDate();
		
	}
}