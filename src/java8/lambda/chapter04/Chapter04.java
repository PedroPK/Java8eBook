package java8.lambda.chapter04;

import static java8.utils.UtilsLibrary.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8.lambda.chapter02.User;
import java8.lambda.chapter02.Usuario;

public class Chapter04 {
	
	public static void forEachExample() {
		List<User> users = getUsersList();
		
		Consumer<User> userConsumer = user -> print("Before printing names.");
		
		Consumer<User> printUsersNames = user -> print(user.getName() + "\n");
		
		users.forEach(userConsumer.andThen(printUsersNames));
	}
	
	public static void predicateExample() {
		Predicate<User> lessThenHundredPoints = new Predicate<User>() {
			public boolean test(User pUser) {
				return pUser.getScore() < 100;
			}
		};
		
		List<User> users = getUsersList();
		users.removeIf(lessThenHundredPoints);
		
		users.forEach(user -> print(user.getName()));
	}
	
	public static void lambdaImplicitPredicateExample() {
		List<User> users = getUsersList();
		users.removeIf(user -> user.getScore() < 100);
		
		users.forEach(user -> print(user.getName()));
	}
	
	public static List<User> getUsersList() {
		User user1 = new Usuario("Paulo Silveira");
		User user2 = new Usuario("Guilherme Silveira");
		User user3 = new Usuario("Rodrigo Turini");
		user1.addScorePoints(180);
		user2.addScorePoints(300);
		user3.addScorePoints(90);
		
		List<User> users = Arrays.asList(user1, user2, user3);
		users = new ArrayList<User>(users);
		return users;
	}
	
}