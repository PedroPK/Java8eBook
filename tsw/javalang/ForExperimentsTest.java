package javalang;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForExperimentsTest {
	
	/**
	 * Test if an empty For(;;) is equivalent to a While( true ) 
	 */
	@Test
	public void testForOnlyWithSemicolons() {
		// Arrange + Act
		int response = ForExperiments.forOnlyWithSemicolons();
		
		// Assert
		int expected = 11;
		assertEquals(expected, response);
	}
	
}
