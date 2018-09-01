package java8.lambda.chapter02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class Chapter02_LambdaExpressions_Test {
	
	@Test
	public void testPrintNames() {
		Chapter02_LambdaExpressions.printNames();
	}
	
	@Test
	public void testPrintNamesForEach() {
		Chapter02_LambdaExpressions.printNamesForEach();
	}
	
	@Test
	public void testPrintNamesLambdaExtensive() {
		Chapter02_LambdaExpressions.printNamesLambdaExtensive();
	}
	
	@Test
	public void testPrintNamesLambdaImplicitTypeWithBrackets() {
		Chapter02_LambdaExpressions.printNamesLambdaImplicitTypeWithBrackets();
	}
	
	@Test
	public void testPrintNamesLambdaImplicitTypeWithoutBrackets() {
		Chapter02_LambdaExpressions.printNamesLambdaImplicitTypeWithoutBrackets();
	}
	
	@Test
	public void testPrintNamesLambdaLean() {
		Chapter02_LambdaExpressions.printNamesLambdaLean();
	}
	
}