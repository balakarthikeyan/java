package javaExamples;

import java.util.*;

public class LinkedListExample{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Bala");
     list.add("Arun");
     list.add("Vivek");
     list.addFirst("Satish");
     list.addLast("Naren");
     list.add(2, "Rajesh");

     //Iterating LinkedList
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
     
     //Clone
     Object str= list.clone();
     System.out.println(str);
     
   } 
} 
