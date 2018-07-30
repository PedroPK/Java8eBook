package java8.lambda.chapter05;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	
	private static Comparator<Usuario> getComparatorCaseSensitive() {
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			@Override
			public int compare(Usuario pUser01, Usuario pUser02) {
				return
					pUser01.getNome().compareTo(
					pUser02.getNome());
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
						pUser01.getNome(),
						pUser02.getNome()
					);
			}
		};
		return comparator;
	}
	
}