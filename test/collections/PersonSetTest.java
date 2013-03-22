package collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class PersonSetTest {

	@Test
	public void testSetWorks() throws Exception {
		SetPerson john = new SetPerson("john", 65);
		SetPerson james = new SetPerson("james", 65);
		SetPerson kent = new SetPerson("kent", 65);
		Set<SetPerson> personsSet = new TreeSet<SetPerson>();
		try {
			personsSet.add(john);
			personsSet.add(james);
			personsSet.add(kent);

		} catch (ClassCastException e) {

			fail("should not throw class cast Exception");
		}

		assertEquals(3, personsSet.size());

	}

	@Test
	public void testSortingWithName() throws Exception {
		SetPerson john = new SetPerson("john", 65);
		SetPerson james = new SetPerson("james", 65);
		SetPerson kent = new SetPerson("kent", 65);
		Set<SetPerson> personsSet = new TreeSet<SetPerson>();

		personsSet.add(john);
		personsSet.add(james);
		personsSet.add(kent);

		assertEquals(
				"[SetPerson [name=james, age=65], SetPerson [name=john, age=65], SetPerson [name=kent, age=65]]",
				personsSet.toString());

	}

	@Test
	public void testDoesNotTakeDuplicates() throws Exception {
		SetPerson john = new SetPerson("john", 65);
		SetPerson james = new SetPerson("john", 65);
		SetPerson kent = new SetPerson("john", 65);
		Set<SetPerson> personsSet = new TreeSet<SetPerson>();

		personsSet.add(john);
		personsSet.add(james);
		personsSet.add(kent);
		System.out.println(personsSet);
	}

}
