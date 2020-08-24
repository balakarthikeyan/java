package javaExamples;

public class DemoFunctionalInterfaceClass implements DemoFunctionalInterface{

    @Override
    public void myAbstractMethod() {
         System.out.println("In myAbstractMethod Override from Class");
    }

    @Override
    public void myDefaultMethod() {
         System.out.println("In myDefaultMethod Override from Class");
    }
    

    public void myStaticMethod() {
        System.out.println("In myStaticMethod Override from Class");
    }
    
	public boolean isNull(String str) {
		System.out.println("IsNull from Class");
		return str == null ? true : false;
	}
	
    public static void main(String args[]){
		DemoFunctionalInterfaceClass obj = new DemoFunctionalInterfaceClass() ;
		obj.myAbstractMethod();
		obj.myDefaultMethod();
		obj.myStaticMethod();
		
		DemoFunctionalInterface.myStaticMethod();
		
		obj.print("abc");
		obj.isNull("abc");
		
		DemoFunctionalInterface obj1 = () -> System.out.println("In myAbstractMethod");
		obj1.myAbstractMethod();
		obj1.myDefaultMethod();
				
    }
}
