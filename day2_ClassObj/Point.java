import java.util.Scanner;
public class Point{

	private int x;	
	private int y;

 	Point()
	{
		x=0;
		y=0;
	}

	void getPoints(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x point ");
		this.x=sc.nextInt();
		System.out.println("Enter y point ");
		this.y=sc.nextInt();
	}

	void displayPoints(){
		System.out.println("["+x+","+y+"]");
	}

	public static void main(String[] args){
		
		Point p = new Point();
		p.displayPoints();

		Point p1 = new Point();
		p1.getPoints();
		p1.displayPoints();
	
	}

}