package javaExamples;

 class AncestorClass
{
	protected String val = "ANCESTOR_VAL";
}

 class SuperClasses extends AncestorClass
{
	protected String val = "SUPER_VAL";
}

public class VariableShadowing extends SuperClasses
{
	private String val = "CHILD_VAL";

	public void displayVal()
	{
		System.out.println("val = " + super.val);
		System.out.println("val = " + ((AncestorClass) this).val);
	}

	public static void main(String[] args)
	{
		VariableShadowing child = new VariableShadowing();
		child.displayVal();
	}
}