package java8.lambda.chapter03;

@FunctionalInterface
public interface Validator<T> {
	
	public boolean validate(T pT);
	
	default void doNothing() {
		
	}
	
}