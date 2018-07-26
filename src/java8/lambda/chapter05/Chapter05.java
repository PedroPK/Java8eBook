package java8.lambda.chapter05;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.lambda.chapter02.Chapter02;
import java8.lambda.chapter02.Usuario;

public class Chapter05 {
	
	public static List<Usuario> sort(List<Usuario> pUsersListToBeSorted) {
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			@Override
			public int compare(Usuario pUser01, Usuario pUser02) {
				return
					pUser01.getNome().compareTo(pUser02.getNome());
			}
		};
		
		Collections.sort(pUsersListToBeSorted, comparator);
		
		return pUsersListToBeSorted;
	}
	
}