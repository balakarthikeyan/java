package javaExamples;

import java.util.*;

public class ListExample{
	public static void main(String args[]){

		// Creating a list 
		List<Integer> l1 = new ArrayList<Integer>(); 
		l1.add(0, 1);
		l1.add(1, 2);
		System.out.println(l1);

		List<String> l2 = new ArrayList<String>(5); 
		l2.add("Java"); 
		l2.add("Practice"); 
		l2.add("Language"); 
		l2.add("IDE"); 
		l2.add("Tutorial");
		System.out.println(l2);
		List<String> range = new ArrayList<String>();
		range = l2.subList(2, 4); 
		System.out.println(range);

		Integer[] array1 = {90, 70, 60};
		Integer array2[]  =  {1, 5, 100, 50, 20, 85, 300, 75, 45, 35};
//		List<Integer> number = new ArrayList<Integer> (Arrays.asList(1, 5, 100, 50, 20, 85, 300, 75, 45, 35));
		List<Integer> number = new ArrayList<Integer>(Arrays.asList(array2)); 
		number.add(0, 80);
		number.add(250);
		number.set(1, 100);
		Collections.addAll(number, array1); 
		Collections.sort(number);

		Iterator iterator = number.iterator();
		while (iterator.hasNext()) {			
			if ( (Integer) iterator.next() >= 100 ) {
				iterator.remove();
			}
		}
		System.out.println(number);
		if(number.contains(90)){
			System.out.println("Yes 90 present");
		}

		List<String> jbtObjs = new ArrayList<>();
		jbtObjs.add("Java");
		jbtObjs.add("Beginners");
		jbtObjs.add("Tutorial");
		for(int i=0; i<jbtObjs.size();i++){
			System.out.print(jbtObjs.get(i));
		}
		
		System.out.println("\n");
		Iterator i = jbtObjs.iterator();
		while (i.hasNext()) {
		    String name = (String) i.next();
		    System.out.print(name);
		}
		
		System.out.println("\n");
		for (String jbtObj : jbtObjs) {
			System.out.print(jbtObj);
		}
		
		System.out.println("\n");
		jbtObjs.forEach(name -> System.out.println(name));
   } 
} 
