package java8.lambda.chapter02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class Chapter02Test {
	
	@Test
	public void testarImpressaoUsuarios() {
		Chapter2.imprimirNomes();
	}
	
	@Test
	public void testarImpressaoNomesForEach() {
		Chapter2.imprimirNomesForEach();
	}
	
	@Test
	public void testarImpressaoNomesLambdaExtenso() {
		Chapter2.imprimirNomesLambdaExtenso();
	}
	
	@Test
	public void testarImpressaoNomesLambdaTipoImplicitoComChaves() {
		Chapter2.imprimirNomesLambdaTipoImplicitoComChaves();
	}
	
	@Test
	public void testarImpressaoNomesLambdaTipoImplicitoSemChaves() {
		Chapter2.imprimirNomesLambdaTipoImplicitoComChaves();
	}
	
	@Test
	public void testarImpressaoNomesLambdaEnxuto() {
		Chapter2.imprimirNomesLambdaEnxuto();
	}
	
}