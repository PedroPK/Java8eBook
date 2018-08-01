package java8.lambda.chapter02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static java8.utils.UtilsLibrary.*;

public class Chapter02 {
	
	/**
	 * Public Methods
	 */
	
	public static void imprimirNomes() {
		print("-- imprimirNomes --");
		
		List<Usuario> usuarios = getListaUsuarios();
		for (Usuario usuario: usuarios) {
			System.out.println(usuario.getName());
		}
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesForEach() {
		print("-- imprimirNomesForEach --");
		
		Consumer<Usuario> impressoraDeNomes = 
			new Consumer<Usuario>() {
				public void accept(Usuario pUsuario) {
					System.out.println(pUsuario.getName());
				}
			};
		
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomes);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaExtenso() {
		print("-- imprimirNomesLambdaExtenso --");
		
		Consumer<Usuario> impressoraDeNomesLambda =
			(Usuario usuario) -> {System.out.println(usuario.getName());};
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaTipoImplicitoComChaves() {
		print("-- imprimirNomesLambdaTipoImplicitoComChaves --");
		
		Consumer<Usuario> impressoraDeNomesLambda =
			usuario -> {System.out.println(usuario.getName());};
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaTipoImplicitoSemChaves() {
		print("-- imprimirNomesLambdaTipoImplicitoSemChaves --");
		
		Consumer<Usuario> impressoraDeNomesLambda =
			usuario -> System.out.println(usuario.getName());
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaEnxuto() {
		print("-- imprimirNomesLambdaEnxuto --");
		
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(usuario -> System.out.println(usuario.getName()));
		
		imprimirSeparadorLinha();
	}
	
	public static List<Usuario> getListaUsuarios() {
		Usuario um			= new Usuario("Paulo Silveira");
		Usuario umPontoUm	= new Usuario("Paulo SILVEIRA");
		Usuario dois		= new Usuario("Rodrigo Turini");
		Usuario tres		= new Usuario("Guilherme Silveira");
		
		um.adicionarPontuacao(10);
		umPontoUm.adicionarPontuacao(17);
		dois.adicionarPontuacao(15);
		tres.adicionarPontuacao(25);
		
		List<Usuario> usuarios = Arrays.asList(um, umPontoUm, dois, tres);
		return usuarios;
	}
	
	/**
	 * Private Methods
	 */
	
}