package object;

import static org.junit.Assert.assertSame;

import org.junit.Test;


public class CloneTest {

	
	@Test
	public void testCloneOfPerson() throws Exception {
		PersonCloneable person = new PersonCloneable("john");
		PersonCloneable personclone = (PersonCloneable) person.clone();
		assertSame(person.name,personclone.name);
		assertSame(2,personclone.personMarks.mathMarks);
	}
}
