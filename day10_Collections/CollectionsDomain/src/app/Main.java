package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br =null;
		try {
			br = new BufferedReader(new FileReader("emails.txt"));
			String str;
			while ((str = br.readLine()) != null) {
			    String substring = str.substring(str.indexOf("@"));

			    if (map.containsKey(substring)) {
			        int val = map.get(substring); 
			        map.put(substring, val + 1);  
			    } else {
			        map.put(substring, 1);        
			    }
			}

			for (Map.Entry<String, Integer> m : map.entrySet()) {
			    System.out.println(m.getKey() + " " + m.getValue());
			}

			
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
