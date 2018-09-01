package javalang;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExperimentalObjectTest {
	
	@Test
	public void testStringCloneEquals() {
		try {
			ExperimentalObject originalObject = new ExperimentalObject( "This is the Original Object." );
			
			ExperimentalObject clonedObject = originalObject.clone();
			
			assertEquals(originalObject, clonedObject);
		} catch (CloneNotSupportedException e) {
			fail();
		}
		
		
	}
	
	@Test
	public void testStringCloneSame() {
		try {
			ExperimentalObject originalObject = new ExperimentalObject( "This is the Original Object." );
			
			ExperimentalObject clonedObject = originalObject.clone();
			
			assertNotSame(originalObject, clonedObject);
		} catch (CloneNotSupportedException e) {
			fail();
		}
	}
	
	@Test
	public void testStringCloneHashcode() {
		try {
			ExperimentalObject originalObject = new ExperimentalObject( "This is the Original Object." );
			
			ExperimentalObject clonedObject = originalObject.clone();
			
			assertEquals(originalObject.hashCode(), clonedObject.hashCode());
		} catch (CloneNotSupportedException e) {
			fail();
		}
	}
	
}