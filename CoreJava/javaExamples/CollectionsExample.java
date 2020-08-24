package javaExamples;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  

class Account{  
    int accountNumber;  
    String name;  
    float AccountBalance;  
    public Account(int accountNumber, String name, float AccountBalance) {  
        this.accountNumber = accountNumber;  
        this.name = name;  
        this.AccountBalance = AccountBalance;  
    }  
}  

//comparator class using Lambda Expressions
public class CollectionsExample {  
  
    public static void main(String[] args) {  
        List<Account> list=new ArrayList<Account>();  
          
        //Adding account details in list  
        list.add(new Account(00235,"Harry",25000));  
        list.add(new Account(11687,"Donald",30088));  
        list.add(new Account(27865,"Caristano",15078));  
          
        System.out.println("Sorting on the basis of account name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });
        
        System.out.println("Account Number:\t\tAccount Name:\t\tAccount Balance:"); 
        
        for(Account p:list){  
            System.out.println(p.accountNumber+"\t\t\t"+p.name+"\t\t\t"+p.AccountBalance);  
        }
    }  
}