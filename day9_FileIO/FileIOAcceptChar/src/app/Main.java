package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			int i;
			int dcount=0;
			int alphacount=0;
			System.out.println("Enter charecters and enter q to quit ");
			while((i=br.read())!='q') {
				if(Character.isAlphabetic(i)) {
					alphacount++;
				}
				if(Character.isDigit(i)) {
					dcount++;
				}
				System.out.println((char)i);
			}
			System.out.println("Digits count = "+dcount);
			System.out.println("Alphabet count = "+alphacount);
			System.out.println("Program ended...");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
