package javaExamples;

import java.util.function.Consumer;
class Person {

    private String name;

    private int age;

    Person(String name,int age){
         this.name=name;
         this.age=age;
    }
    
    public int getAge () {
    	return this.age;
    }
    public int setAge (int age) {
    	return this.age = age;
    }    
}

public class DemoConsumerClass {
     public static void main(String[] args) {
          Consumer<Person> ageIncreaser = (input) -> {
             int newAge = input.getAge()+5;
             input.setAge(newAge);
          };

          Person person = new Person("abc",25);
          ageIncreaser.accept(person);
          System.out.println("New age:"+person.getAge());
     }
}