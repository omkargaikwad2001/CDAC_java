import java.util.Scanner;
public class EvenOdd{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");	
		int n = sc.nextInt(); 
		
		if(n<=0){
			System.out.println("Enter number greater than 0");
			System.exit(0);
		}		

		if(n%2==0){
			System.out.println(n+" is even number");
		}
		else{
			System.out.println(n+" is odd number");
		}
	}

}