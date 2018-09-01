package java8.lambda.chapter03;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java8.lambda.chapter03.Chapter03_RunnableLambda;

@FixMethodOrder(MethodSorters.JVM)
public class Chapter03_RunnableLambda_Test {
	
	@Ignore
	@Test
	public void testCreateRunnable() {
		Chapter03_RunnableLambda.createRunnable();
	}
	
	@Ignore
	@Test
	public void testCreateRunnableWithLambda() {
		Chapter03_RunnableLambda.createRunnableWithLambda();
	}
	
	@Ignore
	@Test
	public void testCreateThreadWithLambdaLean() {
		Chapter03_RunnableLambda.createThreadWithLambdaLean();
	}
	
	@Test
	public void testCepValidationOlindaWithoutDot() {
		Assert.assertTrue( Chapter03_RunnableLambda.validateCep("53130-080") );
	}
	
	@Test
	public void testCepValidationOlindaWithoutDotWithoutHyfen() {
		Assert.assertTrue( Chapter03_RunnableLambda.validateCep("53130080") );
	}
	
	@Test
	public void testCepValidationOlindaWithoutDotWithoutHyfenWithSpace() {
		Assert.assertFalse( Chapter03_RunnableLambda.validateCep("53130 080") );
	}
	
	@Test
	public void testCepValidationOlindaWithDot() {
		Assert.assertTrue( Chapter03_RunnableLambda.validateCep("53.130-080") );
	}
	
	@Test
	public void testCepValidationOlindaWithDotWithoutHyphen() {
		Assert.assertTrue( Chapter03_RunnableLambda.validateCep("53.130080") );
	}
	
	@Test
	public void testCepValidationOlindaWith7Digits() {
		Assert.assertFalse( Chapter03_RunnableLambda.validateCep("5313008") );
	}
	
	@Test
	public void testCepValidationOlindaWith9Digits() {
		Assert.assertFalse( Chapter03_RunnableLambda.validateCep("531300800") );
	}
	
	@Test
	public void testCepValidationOlindaWith10Digits() {
		Assert.assertFalse( Chapter03_RunnableLambda.validateCep("5313008000") );
	}
	
	@Test
	public void testCepValidationOlindaWithAtSymbol() {
		Assert.assertFalse( Chapter03_RunnableLambda.validateCep("53130080@") );
	}
	
}