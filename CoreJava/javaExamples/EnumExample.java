package javaExamples;

class EnumExample {

/*	public enum Workday {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}*/

	public enum Workday {
		MONDAY("Monday"),
		TUESDAY("Tuesday"),
		WEDNESDAY("Wednesday"),
		THURSDAY("Thursday"),
		FRIDAY("Friday");

		private final String representation;

		private Workday(String representation) {
		   this.representation = representation;
		}

		public String getRepresentation() {
		   return this.representation;
		}
	}
	
	private Workday workday;

	public Workday getWorkday() {
		System.out.println("Work day is :" + this.workday);
	   return this.workday;
	}

	public void setWorkday(Workday workday) {
	   this.workday = workday;
	}
		
	
	public static void main(String[] args) {
		EnumExample obj = new EnumExample();
		for(Workday w : Workday.values()) {
			System.out.println(w.name());
			System.out.println(w.getRepresentation());
		}
		obj.setWorkday(Workday.MONDAY);
		obj.getWorkday();
	}

}