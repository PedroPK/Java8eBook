package java8.lambda.chapter03;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java8.lambda.chapter03.Chapter03;

@FixMethodOrder(MethodSorters.JVM)
public class Chapter03Test {
	
	@Test
	public void testCreateRunnable() {
		Chapter03.createRunnable();
	}
	
	@Test
	public void testCreateRunnableWithLambda() {
		Chapter03.createRunnableWithLambda();
	}
	
	@Test
	public void testCreateThreadWithShortLambda() {
		Chapter03.createThreadWithShortLambda();
	}
	
}