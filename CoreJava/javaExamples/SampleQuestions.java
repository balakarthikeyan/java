//Question 1
class Sample {
	static int i;
	static {
		i=10;
	}
	public static void main (String[] args) throws java.lang.Exception {
		Sample mc=new MyClass();
		System.out.println(mc.i);
	}

}

// Question 2
import java.util.Vector; /* Line 2 */

private class MyVector extends Vector {
	int i = 1;  /* Line 5 */ 
	public MyVector() { 
		i = 2; 
	} 
}

public class Sample extends MyVector {
	public MyNewVector () { 
		i = 4;  /* Line 15 */
	}

	public static void main(String args[]) {
		MyVector v = new MyNewVector(); /* Line 19 */
	}
}

// Question 3
class Test implements Cloneable {
	int a;

	Test cloning() {
		try {
			return (Test) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException is caught");
			return this;
		}
	}
}

class Sample {
	public static void main(String args[]) {
		Test obj1 = new Test();
		Test obj2;
		obj1.a = 10;
		obj2 = obj1.cloning();
		obj2.a = 20;
		System.out.println("obj1.a = " + obj1.a);
		System.out.println("obj2.a = " + obj2.a);
	}
}

// Question 4
class Test extends Thread {
	public void run() {
		System.out.println("Run");
	}
}

class Sample {
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		System.out.println("Main");
	}
}

// Question 5
class Sample {
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 20 / a;
			System.out.println("b = " + b);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} finally {
			System.out.println("inside the finally block");
		}
	}
}

// Question 6
class Sample {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.println(s1 + " " + s2 + " " + (s1 == s2));
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
	}
}

// Question 7
import java.io.IOException;

class Parent {
	public void method() throws IOException	{
		System.out.println("Parent");
	}
}

// If there are 100 attributes in a class, how would you achieve setting is
// there any design pattern you can think of.
public class Sample extends Parent {
	public void method() throws Exception {
		System.out.println("Child class");
	}

	public static void main(String[] args) throws IOException {
		Parent obj = new Sample();
		obj.method();
	}
}

// Question 8
// Dijkstra algorithm is based on which algorithm?

// Question 9
class Base {
	public static void show() {
		System.out.println("Base::show() called");
	}
}

class Derived extends Base {
	public static void show() {
		System.out.println("Derived::show() called");
	}
}

class Sample {
	public static void main(String[] args) {
		Base b = new Derived();
		;
		int x = 010;
		int y = 07;
		b.show();
		System.out.println(x);
		System.out.println(y);
	}
}

// Question 10
class Sample {
	public static void main(String[] args) {
		try {
			System.out.println(doStuff(args));
		} catch (Exception e) {
			System.out.println("exc");
		}
		doStuff(args);
	}

	static int doStuff(String[] args) {
		return Integer.parseInt(args[0]);
	}
}

// Question 11
import java.util.*;

class Sample { 
	public static void main(String[] args) { 
		PriorityQueue toDo = new PriorityQueue(); 
		toDo.add("dishes"); 
		toDo.add("laundry"); 
		toDo.add("bills"); 
		toDo.offer("bills"); 
		System.out.print(toDo.size() + " " + toDo.poll()); 
		System.out.print(" " + toDo.peek() + " " + toDo.poll()); 
		System.out.println(" " + toDo.poll() + " " + toDo.poll()); 
	}
}

// Question 12
class SampleDemo implements Runnable {
	private Thread t;
	private String threadName;

	SampleDemo(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		while (true) {
			System.out.print(threadName);
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

class Sample {
	public static void main(String args[]) {
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");
		B.start();
		A.start();
	}
}

// Question 13
// Is ++operator is thread-safe in Java

// Question 14
import java.util.*;

public class Sample {
	public static void SampleMethod(String s) {    
		System.out.println("String");
	}
	public static void SampleMethod(Object o) {
		System.out.println("Object");
	}
	public static void main(String args[]) {
		SampleMethod(null);        
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Mango");
		hashSet.add("Apple");
		hashSet.add("AppleMango");
		System.out.println(hashSet);
	}
}

// Question 15
import java.io.*;

class Sample {
	public static void main(String args[]) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.txt");
			out.write(122);
		} catch (IOException io) {
			System.out.println("IO Error.");
		} finally {
			out.close();
		}
	}
}