package java8.lambda.chapter03;

public interface Validator<T> {
	
	public boolean validate(T pT);
	
}