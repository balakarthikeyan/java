package javaExamples;

/*
 * As implemented Interface have any abstract method so this class need to implement any method.
 */
class InterfaceExample extends InterfaceExampleThree {
	
	@Override
	public void method() {
		System.out.println("Override :" + variables);
	}

	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		obj.method();
	}

}

/*
 * Below interface has an abstract method so implemented class needs to
 * implement this method unless and until it is abstract itself
 */
interface interfaceTwo {
	public final int variables = 9;

	public abstract void method();
}

/*
 * Even if Interface has abstract method ABSTRACT CLASS is not forced to
 * implement it. Abstract class may/may not navigate this responsibility of
 * implementing abstract method to class which is not abstract.
 */
abstract class InterfaceExampleThree implements interfaceTwo {
// Method from Interface is not implemented here
}

