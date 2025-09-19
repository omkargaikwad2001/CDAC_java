package app;

import java.util.HashMap;
import java.util.Map;

public class Main {
	

	public static void main(String[] args) {
		
		String str = "coccacola";
		System.out.println(str);
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				int value= map.get(ch);
				map.put(ch,++value);
			}
			else {
				map.put(ch, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
