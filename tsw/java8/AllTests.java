package java8;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import java8.lambda.chapter02.Chapter02Test;
import java8.lambda.chapter03.Chapter03Test;

@RunWith(Suite.class)
@SuiteClasses({
	Chapter02Test.class,
	Chapter03Test.class
})
public class AllTests {}