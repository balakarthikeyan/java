package javaExamples;

class HelloWorld {
	void method() {
		System.out.println("Inside Hello World Method");
	}
}

public class FirstProgramme {
		 
    static class Wheel {
        public void rotate() {
            System.out.println("The wheel is rotating...");
        }
    }
    
	public static void main(String args[]) throws Exception {

		System.out.println("Hello World of JAVA!");
        String vname = "Java";
        
        if (vname instanceof String) {
            System.out.println("an instance of String class");
        }
        
        if (vname == null || vname.equals("")) {
            throw new IllegalArgumentException("name cannot be null or empty!");
        }
         
        int[]  numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        String nameList[] = {"Tom", "Mary", "Peter", "John", "Adam", "Justin"};
        
        for (String aName : nameList) {
            System.out.println(aName);
        }
        
        Wheel wheel = new Wheel();
        wheel.rotate();
        HelloWorld objHW = new HelloWorld();
        objHW.method();

	}
}
