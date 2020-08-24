package javaExamples;

import java.util.function.Supplier;
import java.util.Random;
public class DemoSupplierClass {

	public static void main(String[] args) {
		Supplier<Integer[]> randomNumberGenerator = () -> { 
			Integer[] result = new Integer[5]; 
			for(int i=0; i< result.length;i++){ 
				result[i] = new Random().nextInt(100);
			}
			return result;
		};
		System.out.println("Result:");
		Integer[] result = randomNumberGenerator.get();
		for(int num:result) {
			System.out.println(num);
		}
	}
}