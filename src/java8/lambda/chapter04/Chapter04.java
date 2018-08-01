package java8.lambda.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8.lambda.chapter02.Usuario;
import static java8.utils.UtilsLibrary.*;

public class Chapter04 {
	
	public static void forEachExample() {
		List<Usuario> users = getUsersList();
		
		Consumer<Usuario> userConsumer = user -> print("Before printing names.");
		
		Consumer<Usuario> printUsersNames = user -> print(user.getName() + "\n");
		
		users.forEach(userConsumer.andThen(printUsersNames));
	}
	
	public static void predicateExample() {
		Predicate<Usuario> lessThenHundredPoints = new Predicate<Usuario>() {
			public boolean test(Usuario pUser) {
				return pUser.getPontuacao() < 100;
			}
		};
		
		List<Usuario> users = getUsersList();
		users.removeIf(lessThenHundredPoints);
		
		users.forEach(user -> print(user.getName()));
	}
	
	public static void lambdaImplicitPredicateExample() {
		List<Usuario> users = getUsersList();
		users.removeIf(user -> user.getPontuacao() < 100);
		
		users.forEach(user -> print(user.getName()));
	}
	
	public static List<Usuario> getUsersList() {
		Usuario user1 = new Usuario("Paulo Silveira");
		Usuario user2 = new Usuario("Guilherme Silveira");
		Usuario user3 = new Usuario("Rodrigo Turini");
		user1.adicionarPontuacao(180);
		user2.adicionarPontuacao(300);
		user3.adicionarPontuacao(90);
		
		List<Usuario> users = Arrays.asList(user1, user2, user3);
		users = new ArrayList<Usuario>(users);
		return users;
	}
	
}