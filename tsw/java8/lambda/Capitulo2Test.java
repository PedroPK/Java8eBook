package java8.lambda;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class Capitulo2Test {
	
	@Test
	public void testarImpressaoUsuarios() {
		Capitulo2.imprimirNomes();
	}
	
	@Test
	public void testarImpressaoNomesForEach() {
		Capitulo2.imprimirNomesForEach();
	}
	
	@Test
	public void testarImpressaoNomesLambdaExtenso() {
		Capitulo2.imprimirNomesLambdaExtenso();
	}
	
	@Test
	public void testarImpressaoNomesLambdaTipoImplicitoComChaves() {
		Capitulo2.imprimirNomesLambdaTipoImplicitoComChaves();
	}
	
	@Test
	public void testarImpressaoNomesLambdaTipoImplicitoSemChaves() {
		Capitulo2.imprimirNomesLambdaTipoImplicitoComChaves();
	}
	
	@Test
	public void testarImpressaoNomesLambdaEnxuto() {
		Capitulo2.imprimirNomesLambdaEnxuto();
	}
	
}