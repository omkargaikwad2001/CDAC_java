package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		List<String>words = new ArrayList<>();
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			System.out.println("Enter list elements and enter quit to stop");
			while(!(str=br.readLine()).equals("quit")) {
				words.add(str);
			}

			System.out.println("Before deleting element");
			for(String s:words) {
				System.out.println(s);
			}
			
			System.out.println("Enter index number to remove element");
			
			int n = Integer.parseInt(br.readLine());
		
			words.remove(n);
			
			System.out.println("After deleting element");
			for(String s:words) {
				System.out.println(s);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				
				br.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
