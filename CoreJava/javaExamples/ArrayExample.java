package javaExamples;

import java.util.*;

public class ArrayExample{
	public static void main(String args[]){

        String arrays[]  = {"Hello ", "Hi ", "How ", "are ", "you?"};

        List<String> list = Arrays.asList(arrays);
        for (String str : list) {
            System.out.print(str);
            System.out.println("Current Index: " + list.indexOf(str));
        }
        System.out.println("\n");

        Iterator iterator1 = Arrays.asList("HEARTS", "SPADES", "CLUBS", "DIAMONDS").iterator();
		while (iterator1.hasNext()) {
		    System.out.println(iterator1.next());
		}
		System.out.println("\n");
        
        for (String rank : Arrays.asList("2", "3", "10", "J", "Q", "K", "A")) {
        	for (String suit : Arrays.asList("HEARTS", "SPADES", "CLUBS", "DIAMONDS")) {
        		System.out.println(suit + " " + rank);
			}
        }
        
   } 
} 
