package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prog Started...");
		
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" Number : ");
			arr[i]=sc.nextInt();
		}
		
		try {
			
			System.out.println("Enter index of number to get value : ");
			int num = sc.nextInt();
			
			System.out.println(arr[num]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+" Enter number in given range ");
		}
		finally {			
			sc.close();
		}
		
		System.out.println("Flow continue...");

	}

}
