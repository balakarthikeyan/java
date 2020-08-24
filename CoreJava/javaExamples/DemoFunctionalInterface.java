package javaExamples;

@FunctionalInterface
public interface DemoFunctionalInterface {
    public void myAbstractMethod();

    public default void myDefaultMethod() {
        System.out.println("Default method from Interface");
    }

    public static void myStaticMethod() {
        System.out.println("Static method from Interface");
    }
    
	default void print(String str) {
		if (!isNull(str)) {
			System.out.println("Print::" + str);
		}
	}

	static boolean isNull(String str) {
		System.out.println("IsNull from Interface");
		return str == null ? true : "".equals(str) ? true : false;
	}
}