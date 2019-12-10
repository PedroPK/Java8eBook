package com.whizlabs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class WhizlabsTest {
	
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPart03() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPart02() {
		Whizlabs.part02(Whizlabs.part01());
	}

	@Test
	public void testPart01() {
		Whizlabs.part01();
	}
	
	@Test
	public void testToArrayWithNonEmptyArgument() {
		ArrayList<String> array01 = Whizlabs.part01();
		String[] array02 = new String[] {"1", "2", "3", "4"};
		String[] array03 = array01.toArray( array02 );
		System.out.println(array03);
	}
	
	@Test
	public void testSwitchCaseMethod() {
		String response = Whizlabs.switchCaseMethod();
		
		assertEquals("Uppercase A", response);
	}
	
}