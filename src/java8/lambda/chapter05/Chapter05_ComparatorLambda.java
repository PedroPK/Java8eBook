package java8.lambda.chapter05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import java8.lambda.chapter02.Chapter02_LambdaExpressions;
import java8.lambda.chapter02.User;

public class Chapter05_ComparatorLambda {
	
	public static List<User> sort(List<User> pUsersToBeSorted) {
		Comparator<User> comparator = getComparatorCaseSensitive();
		
		Collections.sort(pUsersToBeSorted, comparator);
		
		return pUsersToBeSorted;
	}
	
	public static List<User> sortCaseInsensitive(List<User> pUsersToBeSorted) {
		Comparator<User> comparator = getComparatorCaseInsensitive();
		
		Collections.sort(pUsersToBeSorted, comparator);
		
		return pUsersToBeSorted;
	}
	
	public static List<User> sortWithComparatorAndLambdaExtended(List<User> pUsersToBeSorted) {
		Comparator<User> comparator = Comparator.comparing( u -> u.getName());
		
		pUsersToBeSorted.sort(comparator);
		
		return pUsersToBeSorted;
	}
	
	public static List<User> sortWithComparatorAndLambdaShort(List<User> pUsersToBeSorted) {
		pUsersToBeSorted.sort(Comparator.comparing(user -> user.getName()));
		return pUsersToBeSorted;
	}
	
	public static List<String> sortComparatorByNaturalOrder() {
		List<String> words = Arrays.asList("House of Codes", "KeyElon", "Allure");
		words.sort(Comparator.naturalOrder());
		
		return words;
	}
	
	public static List<String> sortComparatorByReverseOrder() {
		List<String> words = Arrays.asList("House of Codes", "Allure", "KeyElon");
		words.sort(Comparator.reverseOrder());
		
		return words;
	}
	
	public static List<User> compareNameThroughFunction() {
		Function<User, String> extractName = user -> user.getName();
		Comparator<User> comparatorByName = Comparator.comparing(extractName);
		
		List<User> usersList = Chapter02_LambdaExpressions.getUsersList();
		usersList.sort(comparatorByName);
		
		return usersList;
	}
	
	public static List<User> comparePontuationThroughToIntFunction() {
		ToIntFunction<User> extractPontuation = user -> user.getScore();
		Comparator<User> comparatorByPontuation = Comparator.comparingInt(extractPontuation);
		
		List<User> usersList = Chapter02_LambdaExpressions.getUsersList();
		usersList.sort(comparatorByPontuation);
		
		return usersList;
	}
	
	public static List<User> comparePontuationThroughComparatorComparingInt() {
		List<User> usersList = Chapter02_LambdaExpressions.getUsersList();
		usersList.sort(Comparator.comparingInt(user -> user.getScore()));
		
		return usersList;
	}
	
	private static Comparator<User> getComparatorCaseSensitive() {
		Comparator<User> comparator = new Comparator<User>() {
			@Override
			public int compare(User pUser01, User pUser02) {
				return
					pUser01.getName().compareTo(
					pUser02.getName());
			}
		};
		
		return comparator;
	}
	
	private static Comparator<User> getComparatorCaseInsensitive() {
		Comparator<User> comparator = new Comparator<User>() {
			@Override
			public int compare(User pUser01, User pUser02) {
				return
					String.CASE_INSENSITIVE_ORDER.compare(
						pUser01.getName(),
						pUser02.getName()
					);
			}
		};
		
		return comparator;
	}
	
}