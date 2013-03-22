package object;

public class PersonCloneable implements Cloneable {

	String name;
	Marks personMarks;
	class Marks{
		public int mathMarks;
		public Marks(){
			this.mathMarks=2;
		}
	};
	private PersonCloneable object;

	public PersonCloneable(String string) {
		this.name = string;
		personMarks=new Marks();
	}


	protected Object clone(){
		return null;
	}

}
