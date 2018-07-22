package java8.lambda.chapter03;

public class Chapter03 {
	
	public static void createRunnable() {
		Runnable runner = new Runnable() {
			public void run() {
				for ( int i = 0; i < 100; i = i + 1) {
					System.out.println("Counter = " + i);
				}
			}
		};
		
		new Thread(runner).start();
	}
	
	public static void createRunnableWithLambda() {
		Runnable runner = () -> {
			for ( int i = 0; i < 100; i = i + 1) {
				System.out.println("Counter with Lambda= " + i);
			}
		};
		
		new Thread(runner).start();
	}
	
	public static void createThreadWithShortLambda() {
		new Thread(
			() -> {
				for ( int i = 0; i < 100; i = i + 1) {
					System.out.println("Thread Counter with short Lambda= " + i);
				}
			}
		).start();
	}
	
	public static boolean validateCep(String pString) {
		Validator<String> cepValidator = new Validator<String>() {
			public boolean validate(String pStringToValidade) {
				return pStringToValidade.matches("[0-9]{2}[.]?[0-9]{3}[-]?[0-9]{3}");
			}
		};
		
		return cepValidator.validate(pString);
	}
	
}