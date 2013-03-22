package collections;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;


public class HashMapTest {
	
	@Test
	public void testHashMapWorks() throws Exception {
		HashMapPerson john = new HashMapPerson("john",65);
		HashMapPerson james = new HashMapPerson("james",65);
		HashMapPerson kent = new HashMapPerson("kent",65);
		HashMap<HashMapPerson,Object> personsMap = new HashMap<HashMapPerson,Object>();
		personsMap.put(john, null);
		personsMap.put(james, null);
		personsMap.put(kent, null);		
		assertTrue(personsMap.size()==3);		
	}

}
