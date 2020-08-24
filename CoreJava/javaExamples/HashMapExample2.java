package javaExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String args[]) {

		/* This is how to declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/*Adding elements to HashMap*/
		hmap.put(12, "Arun");
		hmap.put(2, "Ramesh");
		hmap.put(7, "Prabha");
		hmap.put(49, "Kannan");
		hmap.put(3, "Srini");

		/* Display content using Iterator*/
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("Key is: "+ mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		/* Get values based on key*/
		String var= hmap.get(2);
		System.out.println("Value at index 2 is: "+var);

		/* Remove values based on key*/
		hmap.remove(3);
		System.out.println("Map key and values after removal:");
		System.out.println(hmap);
	}
}