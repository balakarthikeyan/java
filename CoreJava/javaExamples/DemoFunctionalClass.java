package javaExamples;

import java.util.function.function;
public class DemoFunctionalClass {
     public static void main(String[] args) {
          Function<Integer,Double> squareRootGenerator = (input) -> {return Math.sqrt(input);};
          int input = 16;
          double result = squareRootGenerator.apply(input);
          System.out.println("Square Root of "+input+" is "+result);
     }
}
