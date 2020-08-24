package javaExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample{
	public static void main(String args[]){


		Map<String, String> mapObj = new HashMap<String, String>();
		mapObj.put("Website Name","Java Beginners Tutorial");
		mapObj.put("Language", "Java");
		mapObj.put("Topic", "Collection");

		for (Map.Entry<String, String> entry : mapObj.entrySet()) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}

		// Iterating over collection object using iteration even before Java 5
		Iterator<Entry<String, String>> iterator2 = mapObj.entrySet().iterator();
		while (iterator2.hasNext()) {
			Entry<String, String> thisEntry = (Entry<String, String>) iterator2.next();
			Object key = thisEntry.getKey();
			Object value = thisEntry.getValue();
			System.out.println(key+" -> "+value);
		}
		
		mapObj.forEach((key,value) -> System.out.println(key+" : "+value));
        
   } 
} 
