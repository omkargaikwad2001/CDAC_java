import java.util.*;
public class ReverseNum{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter number ");
		int n=sc.nextInt();
		
		int rev=0;
		int lastD;
		while(n>0){
			lastD=n%10;
			rev=lastD+(rev*10);
			n=n/10;
		}

		System.out.println("Reverse number = "+rev);
	}
}