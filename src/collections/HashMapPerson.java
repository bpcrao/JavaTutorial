package collections;

/**
 * 
 * this class does not work with hash map properly
 * 
 * 
 */

public class HashMapPerson {

	private String name;
	private int age;

	public HashMapPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + age + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof HashMapPerson)) {
			return false;
		}
		HashMapPerson other = (HashMapPerson) obj;
		if (age != other.age) {
			return false;
		}
		
		return true;
	}



}
