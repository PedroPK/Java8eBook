package java8.lambda.chapter02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter2 {
	
	/**
	 * Public Methods
	 */
	
	public static void imprimirNomes() {
		System.out.println("-- imprimirNomes --");
		
		List<Usuario> usuarios = getListaUsuarios();
		for (Usuario usuario: usuarios) {
			System.out.println(usuario.getNome());
		}
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesForEach() {
		System.out.println("-- imprimirNomesForEach --");
		
		Consumer<Usuario> impressoraDeNomes = 
			new Consumer<Usuario>() {
				public void accept(Usuario pUsuario) {
					System.out.println(pUsuario.getNome());
				}
			};
		
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomes);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaExtenso() {
		System.out.println("-- imprimirNomesLambdaExtenso --");
		
		Consumer<Usuario> impressoraDeNomesLambda =
				(Usuario usuario) -> {System.out.println(usuario.getNome());};
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaTipoImplicitoComChaves() {
		System.out.println("-- imprimirNomesLambdaTipoImplicitoComChaves --");
		
		Consumer<Usuario> impressoraDeNomesLambda =
				usuario -> {System.out.println(usuario.getNome());};
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaTipoImplicitoSemChaves() {
		System.out.println("-- imprimirNomesLambdaTipoImplicitoSemChaves --");
		
		Consumer<Usuario> impressoraDeNomesLambda =
				usuario -> System.out.println(usuario.getNome());
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaEnxuto() {
		System.out.println("-- imprimirNomesLambdaEnxuto --");
		
		List<Usuario> usuarios = getListaUsuarios();
		usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
		
		imprimirSeparadorLinha();
	}
	
	/**
	 * Private Methods
	 */
	
	private static void imprimirSeparadorLinha() {
		System.out.println("-- ----------------- --\n");
	}
	
	private static List<Usuario> getListaUsuarios() {
		Usuario um		= new Usuario("Paulo Silveira");
		Usuario dois	= new Usuario("Guilherme Silveira");
		Usuario tres	= new Usuario("Rodrigo Turini");
		
		List<Usuario> usuarios = Arrays.asList(um, dois, tres);
		return usuarios;
	}
	
}