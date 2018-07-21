package java8.lambda.chapter02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class Chapter02Test {
	
	@Test
	public void testarImpressaoUsuarios() {
		Chapter02.imprimirNomes();
	}
	
	@Test
	public void testarImpressaoNomesForEach() {
		Chapter02.imprimirNomesForEach();
	}
	
	@Test
	public void testarImpressaoNomesLambdaExtenso() {
		Chapter02.imprimirNomesLambdaExtenso();
	}
	
	@Test
	public void testarImpressaoNomesLambdaTipoImplicitoComChaves() {
		Chapter02.imprimirNomesLambdaTipoImplicitoComChaves();
	}
	
	@Test
	public void testarImpressaoNomesLambdaTipoImplicitoSemChaves() {
		Chapter02.imprimirNomesLambdaTipoImplicitoComChaves();
	}
	
	@Test
	public void testarImpressaoNomesLambdaEnxuto() {
		Chapter02.imprimirNomesLambdaEnxuto();
	}
	
}