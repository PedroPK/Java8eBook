package java8;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import java8.lambda.chapter02.Chapter02_LambdaExpressions_Test;
import java8.lambda.chapter03.Chapter03_RunnableLambda_Test;

@RunWith(Suite.class)
@SuiteClasses({
	Chapter02_LambdaExpressions_Test.class,
	Chapter03_RunnableLambda_Test.class
})
public class AllTests {}