package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        
        BufferedReader br = null; 
        
        try {
            
            br = new BufferedReader(new InputStreamReader(System.in));
            
            String str;
            String lstring = null;
            int count=0;
            System.out.println("Enter lines (type 'quit' to exit):");
            while(!(str = br.readLine()).equals("quit")) {
                System.out.println(str);
                count++;
                if(count<str.length()) {
                	count=str.length();
                	lstring=str;
                }
                
            }
            
            System.out.println("Longest String = "+lstring);
            System.out.println("Number of charecters = "+count);
            
        } catch(IOException e) {
            e.printStackTrace();
            
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}