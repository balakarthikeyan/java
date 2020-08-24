package javaExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map<HMClass, Integer> m1 = new HashMap<HMClass, Integer>();

		HMClass t1 = new HMClass(3, 8);
		HMClass t2 = new HMClass(3, 8);
		HMClass t3 = new HMClass(10, 11);

		m1.put(t1, 10);
		m1.put(t2, 100);
		m1.put(t3, 1000);

		/*
		 * Below you can find 3 different ways to iterate a Map. 
		 * Pay attention to when Hashcode and Equals is called
		 */

/*		Set s = m1.entrySet();
		for (Iterator i = s.iterator(); i.hasNext();) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
*/

/*		for (Map.Entry<HMClass, Integer> entry : m1.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
*/

		for (Object key : m1.keySet()) {
			System.out.println("Key : " + key.toString() + " Value : " + m1.get(key));
		}

	}
}

class HMClass {
	HMClass(int i, int j) {
		this.i = i;
		this.j = j;
	}

	int i, j;

	@Override
	public int hashCode() {
		int k = i + j;
		System.out.println("Inside HashCode Method : " + k);
		return k;
	}

	@Override
	public boolean equals(Object obj) {
		if (i == ((HMClass) obj).i && j == ((HMClass) obj).j) {
			System.out.println("Inside Equals Method");
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return String.valueOf(i).concat(String.valueOf(j));
	}
}
