package com.Array;

import java.util.Scanner;

public class ArrayMinMax {

public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter size of array ");
		int n=sc.nextInt();

		int arr[] = new int[n];

		for(int i=0;i<n;i++){
			System.out.println("Enter "+(i+1)+" number of array ");
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
	
			if(arr[i]<min){
				min=arr[i];
			}
		}
	
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
		
	}

}
