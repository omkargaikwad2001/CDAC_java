package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = null; 
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			String str=null;
			System.out.println("Enter lines ");
			while(!(str.equals("quit"))) {
				System.out.println(str);
				str = br.readLine();
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
