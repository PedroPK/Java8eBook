package java8.lambda.chapter05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import java8.lambda.chapter02.Chapter02;
import java8.lambda.chapter02.Usuario;

public class Chapter05 {
	
	public static List<Usuario> sort(List<Usuario> pUsersToBeSorted) {
		Comparator<Usuario> comparator = getComparatorCaseSensitive();
		
		Collections.sort(pUsersToBeSorted, comparator);
		
		return pUsersToBeSorted;
	}
	
	public static List<Usuario> sortCaseInsensitive(List<Usuario> pUsersToBeSorted) {
		Comparator<Usuario> comparator = getComparatorCaseInsensitive();
		
		Collections.sort(pUsersToBeSorted, comparator);
		
		return pUsersToBeSorted;
	}
	
	public static List<Usuario> sortWithComparatorAndLambdaExtended(List<Usuario> pUsersToBeSorted) {
		Comparator<Usuario> comparator = Comparator.comparing( u -> u.getName());
		
		pUsersToBeSorted.sort(comparator);
		
		return pUsersToBeSorted;
	}
	
	public static List<Usuario> sortWithComparatorAndLambdaShort(List<Usuario> pUsersToBeSorted) {
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
	
	public static List<Usuario> compareNameThroughFunction() {
		Function<Usuario, String> extractName = user -> user.getName();
		Comparator<Usuario> comparatorByName = Comparator.comparing(extractName);
		
		List<Usuario> usersList = Chapter02.getListaUsuarios();
		usersList.sort(comparatorByName);
		
		return usersList;
	}
	
	public static List<Usuario> comparePontuationThroughToIntFunction() {
		ToIntFunction<Usuario> extractPontuation = user -> user.getPontuacao();
		Comparator<Usuario> comparatorByPontuation = Comparator.comparingInt(extractPontuation);
		
		List<Usuario> usersList = Chapter02.getListaUsuarios();
		usersList.sort(comparatorByPontuation);
		
		return usersList;
	}
	
	public static List<Usuario> comparePontuationThroughComparatorComparingInt() {
		List<Usuario> usersList = Chapter02.getListaUsuarios();
		usersList.sort(Comparator.comparingInt(user -> user.getPontuacao()));
		
		return usersList;
	}
	
	private static Comparator<Usuario> getComparatorCaseSensitive() {
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			@Override
			public int compare(Usuario pUser01, Usuario pUser02) {
				return
					pUser01.getName().compareTo(
					pUser02.getName());
			}
		};
		
		return comparator;
	}
	
	private static Comparator<Usuario> getComparatorCaseInsensitive() {
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			@Override
			public int compare(Usuario pUser01, Usuario pUser02) {
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