package java8.lambda.chapter03;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java8.lambda.chapter03.Chapter03;

@FixMethodOrder(MethodSorters.JVM)
public class Chapter03Test {
	
	@Ignore
	@Test
	public void testCreateRunnable() {
		Chapter03.createRunnable();
	}
	
	@Ignore
	@Test
	public void testCreateRunnableWithLambda() {
		Chapter03.createRunnableWithLambda();
	}
	
	@Ignore
	@Test
	public void testCreateThreadWithShortLambda() {
		Chapter03.createThreadWithShortLambda();
	}
	
	@Test
	public void testCepValidationOlindaWithoutDot() {
		Assert.assertTrue( Chapter03.validateCep("53130-080") );
	}
	
	@Test
	public void testCepValidationOlindaWithoutDotWithoutHyfen() {
		Assert.assertTrue( Chapter03.validateCep("53130080") );
	}
	
	@Test
	public void testCepValidationOlindaWithDot() {
		Assert.assertTrue( Chapter03.validateCep("53.130-080") );
	}
	
	@Test
	public void testCepValidationOlindaWithDotWithoutHyphen() {
		Assert.assertTrue( Chapter03.validateCep("53.130080") );
	}
	
	@Test
	public void testCepValidationOlindaWithExtraDigit() {
		Assert.assertFalse( Chapter03.validateCep("531300800") );
	}
	
}