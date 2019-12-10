package java8.lambda.chapter02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static java8.utils.UtilsLibrary.*;

public class Chapter02_LambdaExpressions {
	
	/**
	 * Public Methods
	 */
	
	public static void printNames() {
		print("-- printNames() --");
		
		List<User> usersList = getUsersList();
		for (User user: usersList) {
			System.out.println(user.getName());
		}
		
		printLineSeparator();
	}
	
	public static void printNamesForEach() {
		print("-- printNamesForEach() --");
		
		Consumer<User> namesPrinter =
			new Consumer<User>() {
				public void accept(User pUser) {
					System.out.println(pUser.getName());
				}
			};
			
		List<User> usersList = getUsersList();
		usersList.forEach(namesPrinter);
		
		printLineSeparator();
	}
	
	public static void printNamesLambdaExtensive() {
		print("-- printNamesLambdaExtensive() --");
		
		Consumer<User> namesPrinterLambda =
			(User user) -> {
				System.out.println(		user.getName()	);
			};
		List<User> usersList = getUsersList();
		usersList.forEach(namesPrinterLambda);
		
		printLineSeparator();
	}
	
	public static void printNamesLambdaImplicitTypeWithBrackets() {
		print("-- printNamesLambdaImplicitTypeWithBrackets() --");
		
		Consumer<User> namesPrinterLambda =
			user -> {
				System.out.println(user.getName());
			};
		List<User> userList = getUsersList();
		userList.forEach(namesPrinterLambda);
		
		printLineSeparator();
	}
	
	public static void printNamesLambdaImplicitTypeWithoutBrackets() {
		print("-- printNamesLambdaImplicitTypeWithoutBrackets() --");
		
		Consumer<User> namesPrinterLambda =
			usuario -> System.out.println(usuario.getName());
		List<User> usersList = getUsersList();
		usersList.forEach(namesPrinterLambda);
		
		printLineSeparator();
	}
	
	public static void printNamesLambdaLean() {
		print("-- printNamesLambdaLean() --");
		
		List<User> usersList = getUsersList();
		usersList.forEach(user -> System.out.println(user.getName()));
		
		printLineSeparator();
	}
	
	public static List<User> getUsersList() {
		User firstUser			= new Usuario("Paulo Silveira");
		User firstUserVeriation	= new Usuario("Paulo SILVEIRA");
		User secondUser			= new Usuario("Rodrigo Turini");
		User thirdUser			= new Usuario("Guilherme Silveira");
		
		firstUser			.addScorePoints(10);
		firstUserVeriation	.addScorePoints(17);
		secondUser			.addScorePoints(15);
		thirdUser			.addScorePoints(25);
		
		List<User> usersList = Arrays.asList(firstUser, firstUserVeriation, secondUser, thirdUser);
		return usersList;
	}
	
	/**
	 * Private Methods
	 */
	
}