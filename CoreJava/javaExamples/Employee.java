package javaExamples;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee extends superEmployee implements variableConstant
{
   public String firstName;
   //public String lastName;
   //transient public String lastName;
	transient final String address = "Coimbatore";
	static transient String company = "Unimoni";   
   //private static final long serialVersionUID = 5462223600l;
}

class superEmployee implements Serializable {
	public String lastName;
}

interface variableConstant  {
	public static final String education = "MCA";
}