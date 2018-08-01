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
		
		List<User> usuarios = getListaUsuarios();
		for (User usuario: usuarios) {
			System.out.println(usuario.getName());
		}
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesForEach() {
		print("-- imprimirNomesForEach --");
		
		Consumer<User> impressoraDeNomes = 
			new Consumer<User>() {
				public void accept(User pUsuario) {
					System.out.println(pUsuario.getName());
				}
			};
		
		List<User> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomes);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaExtenso() {
		print("-- imprimirNomesLambdaExtenso --");
		
		Consumer<User> impressoraDeNomesLambda =
			(User usuario) -> {System.out.println(usuario.getName());};
		List<User> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaTipoImplicitoComChaves() {
		print("-- imprimirNomesLambdaTipoImplicitoComChaves --");
		
		Consumer<User> impressoraDeNomesLambda =
			usuario -> {System.out.println(usuario.getName());};
		List<User> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaTipoImplicitoSemChaves() {
		print("-- imprimirNomesLambdaTipoImplicitoSemChaves --");
		
		Consumer<User> impressoraDeNomesLambda =
			usuario -> System.out.println(usuario.getName());
		List<User> usuarios = getListaUsuarios();
		usuarios.forEach(impressoraDeNomesLambda);
		
		imprimirSeparadorLinha();
	}
	
	public static void imprimirNomesLambdaEnxuto() {
		print("-- imprimirNomesLambdaEnxuto --");
		
		List<User> usuarios = getListaUsuarios();
		usuarios.forEach(usuario -> System.out.println(usuario.getName()));
		
		imprimirSeparadorLinha();
	}
	
	public static List<User> getListaUsuarios() {
		User um			= new Usuario("Paulo Silveira");
		User umPontoUm	= new Usuario("Paulo SILVEIRA");
		User dois		= new Usuario("Rodrigo Turini");
		User tres		= new Usuario("Guilherme Silveira");
		
		um.addScorePoints(10);
		umPontoUm.addScorePoints(17);
		dois.addScorePoints(15);
		tres.addScorePoints(25);
		
		List<User> usuarios = Arrays.asList(um, umPontoUm, dois, tres);
		return usuarios;
	}
	
	/**
	 * Private Methods
	 */
	
}