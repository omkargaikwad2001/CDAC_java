package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(12, "Java");
        map.put(7, "Python");
        map.put(25, "C++");
        map.put(19, "Go");
        map.put(3, "Kotlin");
        map.put(45, "Ruby");
        map.put(31, "Swift");
        map.put(28, "Scala");
        map.put(16, "Rust");
        map.put(22, "TypeScript");
        
        System.out.println(map);
        
        Set<Map.Entry<Integer, String>> s = map.entrySet();
        
        Iterator<Entry<Integer, String>> iterator = s.iterator();
        
        System.out.println("\nUsing iterator");
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        
        System.out.println("\nUsing for each loop");
        
        for(Map.Entry<Integer, String> m : map.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }

	}

}
