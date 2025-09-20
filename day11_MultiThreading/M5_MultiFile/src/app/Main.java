package app;

import java.util.Scanner;

import util.MyRunnable;

public class Main {

    public static void main(String[] args) {
    
    		System.out.println("Main Started...");
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Source File name");
        String source = sc.nextLine();
        
        System.out.println("Enter Destination File name");
        String destination = sc.nextLine();
        
        MyRunnable r = new MyRunnable(source,destination);
        r.getT().start();
        
        for(int i=1;i<=50;i++) {
        	System.out.println("This is main = "+i);
        }
        
        System.out.println("Main Ended...");
    }
}
