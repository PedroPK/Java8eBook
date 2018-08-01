package java8.lambda.chapter05;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

import java8.lambda.chapter02.Chapter02;
import java8.lambda.chapter02.Usuario;
import java8.utils.UtilsLibrary;

public class Chapter05Test {
	
	@Test
	public void ordenateUsers() {
		List<Usuario> unsortedList	= Chapter02.getListaUsuarios();
		List<Usuario> sortedList	= Chapter05.sort(Chapter02.getListaUsuarios());
		
		assertEquals(			unsortedList.size(),		sortedList.size()	);
		assertNotEquals(		sortedList,					unsortedList);
		assertNotSame(			sortedList,					unsortedList);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList,				sortedList);
		assertFalse(		areAllUsersEquals	);
	}
	
	@Test
	public void testSortWithComparatorAndLambdaExtended() {
		List<Usuario> unsortedList	= Chapter02.getListaUsuarios();
		List<Usuario> sortedList	= Chapter05.sortWithComparatorAndLambdaExtended(Chapter02.getListaUsuarios());
		
		assertEquals(			unsortedList.size(),		sortedList.size()	);
		assertNotEquals(		sortedList,					unsortedList);
		assertNotSame(			sortedList,					unsortedList);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList,				sortedList);
		assertFalse(		areAllUsersEquals	);
		
		/*for (Usuario user: sortedList) {
			UtilsLibrary.print( user.getNome() );
		}*/
	}
	
	@Test
	public void testSortWithComparatorAndLambdaShort() {
		List<Usuario> unsortedList	= Chapter02.getListaUsuarios();
		List<Usuario> sortedList	= Chapter05.sortWithComparatorAndLambdaShort(Chapter02.getListaUsuarios());
		
		assertEquals(			unsortedList.size(),		sortedList.size()	);
		assertNotEquals(		sortedList,					unsortedList);
		assertNotSame(			sortedList,					unsortedList);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList,				sortedList);
		assertFalse(		areAllUsersEquals	);
		
		/*for (Usuario user: sortedList) {
			UtilsLibrary.print( user.getNome() );
		}*/
	}
	
	@Test
	public void testEqualsUnsortedUsers() {
		List<Usuario> unsortedList01	= Chapter02.getListaUsuarios();
		List<Usuario> unsortedList02	= Chapter02.getListaUsuarios();
		
		assertEquals(	unsortedList01.size(),	unsortedList02.size()	);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList01, unsortedList02);
		assertTrue(		areAllUsersEquals	);
	}
	
	@Test
	public void testSameUnsortedUsers() {
		List<Usuario> unsortedList01	= Chapter02.getListaUsuarios();
		List<Usuario> unsortedList02	= Chapter02.getListaUsuarios();
		
		assertEquals(	unsortedList01.size(),	unsortedList02.size()	);
		
		boolean areAllUsersTheSame = assertAllUsersAreSame(unsortedList01, unsortedList02);
		
		assertFalse(	areAllUsersTheSame	);
	}
	
	@Test
	public void testComparatorNaturalOrder() {
		List<String> sortedList = Chapter05.sortComparatorByNaturalOrder();
		/*for ( String word: sortedList ) {
			UtilsLibrary.print(word);
		}*/
	}
	
	@Test
	public void testComparatorReverseOrder() {
		List<String> sortedList = Chapter05.sortComparatorByReverseOrder();
		/*for ( String word: sortedList ) {
			UtilsLibrary.print(word);
		}*/
	}
	
	@Test
	public void testCompareNameThroughFunction() {
		List<Usuario> usersList = Chapter05.compareNameThroughFunction();
		
		/*UtilsLibrary.print("=== testCompareNameThroughFunction ===");
		for ( Usuario user: usersList ) {
			UtilsLibrary.print(user.getNome());
		}*/
	}
	
	@Test
	public void testComparePontuationThroughToIntFunction() {
		List<Usuario> usersList = Chapter05.comparePontuationThroughToIntFunction();
		
		/*UtilsLibrary.print("=== testComparePontuationThroughToIntFunction ===");
		for ( Usuario user: usersList ) {
			UtilsLibrary.print(user.getNome() + " = " + user.getPontuacao());
		}*/
	}
	
	@Test
	public void testcomparePontuationThroughComparatorComparingInt() {
		List<Usuario> usersList = Chapter05.comparePontuationThroughComparatorComparingInt();
		
		UtilsLibrary.print("=== testcomparePontuationThroughComparatorComparingInt ===");
		for ( Usuario user: usersList ) {
			UtilsLibrary.print(user.getName() + " = " + user.getPontuacao());
		}
	}
	
	private boolean assertAllUsersAreEquals(List<Usuario> pList01, List<Usuario> pList02) {
		boolean areAllUsersEquals = true;
		for ( int i = 0; i < pList01.size()  ; i = i + 1 ) {
			Usuario user01 = pList01.get(i);
			Usuario user02 = pList02.get(i);
			
			if ( !user01.equals(user02) ) {
				areAllUsersEquals = false;
				break;
			}
		}
		
		return areAllUsersEquals;
	}
	
	private boolean assertAllUsersAreSame(List<Usuario> pList01, List<Usuario> pList02) {
		boolean areAllUsersTheSame = true;
		for ( int i = 0; i < pList01.size()  ; i = i + 1 ) {
			Usuario user01 = pList01.get(i);
			Usuario user02 = pList02.get(i);
			
			if ( user01 != user02 ) {
				areAllUsersTheSame = false;
				break;
			}
		}
		return areAllUsersTheSame;
	}
	
}