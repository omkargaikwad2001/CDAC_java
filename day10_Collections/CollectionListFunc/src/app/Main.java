package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

			System.out.println("Number of elements in collection = "+words.size());
			System.out.println("Displaying with advance for loop");
			for(String s:words) {
				System.out.println(s);
			}
			
			System.out.println("Displaying with Iterator");
			Iterator<String> itr = words.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println("Displaying with ListIterator with previous()");
			ListIterator<String> lstr = words.listIterator();
			while(lstr.hasNext()) {
				lstr.next();
			}
			while(lstr.hasPrevious()) {
				System.out.println(lstr.previous());
			}
			
			System.out.println("Displaying wiht for each method");
			
			words.forEach(s->System.out.println(s));
			
			System.out.println("Sorted words");
			Collections.sort(words);
			System.out.println(words);
			
			System.out.println("Reverse Words");
			Collections.reverse(words);
			System.out.println(words);
			
			System.out.println("Enter the string");
			String name = br.readLine();
			
			if(words.contains(name)) {
				System.out.println("name is present at "+words.indexOf(name));
			}else {
				System.out.println("name is not present");
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
