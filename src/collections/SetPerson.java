package collections;

public class SetPerson {
	private String name;
	private int age;
	public SetPerson(String string, int i) {
		this.name=string;
		this.age=i;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SetPerson [name=" + name + ", age=" + age + "]";
	}
	
}
