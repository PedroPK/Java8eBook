package java8.lambda.chapter03;

public class Chapter03_RunnableLambda {
	
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
	
	public static void createThreadWithLambdaLean() {
		new Thread(
			() -> {
				for ( int i = 0; i < 100; i = i + 1) {
					System.out.println("Thread Counter with short Lambda= " + i);
				}
			}
		).start();
	}
	
	/**
	 * This method will indicate if the Parameter is a Valid BRazilian ZIP Code (CEP - Código de Endereçamento Postal)
	 * 
	 * @param pCEP
	 * @return
	 */
	public static boolean validateCep(String pCEP) {
		Validator<String> cepValidator = new Validator<String>() {
			public boolean validate(String pStringToValidade) {
				return pStringToValidade.matches("[0-9]{2}[.]?[0-9]{3}[-]?[0-9]{3}");
			}
		};
		
		return cepValidator.validate(pCEP);
	}
	
	public void accessingNonFinalVariables() {
		int number = 5;
		new Thread (
			() -> {
				System.out.println(number);
			}
		).start();
		
		//number = 10;
	}
}