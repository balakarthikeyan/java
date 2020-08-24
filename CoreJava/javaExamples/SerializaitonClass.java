package javaExamples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javaExamples.Employee;

public class SerializaitonClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "Balakarthikeyan";
		emp.lastName = "Anandakumar";

		try {
			FileOutputStream fileOut = new FileOutputStream("./employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in ./employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
