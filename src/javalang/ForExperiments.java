package javalang;

public class ForExperiments {
	
	public static int forOnlyWithSemicolons() {
		int inteiro = 0;
		
		for (;;) {
			System.out.println(inteiro);
			
			if ( inteiro > 10 ) {
				break;
			}
			
			inteiro = inteiro + 1;
		}
		
		return inteiro;
		
	}
	
}