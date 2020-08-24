package javaExamples;

class CreateObjectWithClone {

	public static void main(String[] args) {

		ClassClone obj1 = new ClassClone();
		System.out.println(obj1);
		try {
			ClassClone obj2 = (ClassClone) obj1.clone();
			System.out.println(obj2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class ClassClone implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	int i;
	static int j = 10;

	ClassClone() {
		i = j++;
	}

	@Override
	public String toString() {
		return "Value of i :" + i;
	}
}