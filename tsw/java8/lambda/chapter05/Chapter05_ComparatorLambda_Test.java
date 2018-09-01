package java8.lambda.chapter05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import java8.lambda.chapter02.Chapter02_LambdaExpressions;
import java8.lambda.chapter02.User;
import java8.utils.UtilsLibrary;

public class Chapter05_ComparatorLambda_Test {
	
	@Test
	public void ordenateUsers() {
		List<User> unsortedList	= Chapter02_LambdaExpressions.getUsersList();
		List<User> sortedList	= Chapter05_ComparatorLambda.sort(Chapter02_LambdaExpressions.getUsersList());
		
		assertEquals(			unsortedList.size(),		sortedList.size()	);
		assertNotEquals(		sortedList,					unsortedList);
		assertNotSame(			sortedList,					unsortedList);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList,				sortedList);
		assertFalse(		areAllUsersEquals	);
	}
	
	@Test
	public void testSortWithComparatorAndLambdaExtended() {
		List<User> unsortedList	= Chapter02_LambdaExpressions.getUsersList();
		List<User> sortedList	= Chapter05_ComparatorLambda.sortWithComparatorAndLambdaExtended(Chapter02_LambdaExpressions.getUsersList());
		
		assertEquals(			unsortedList.size(),		sortedList.size()	);
		assertNotEquals(		sortedList,					unsortedList);
		assertNotSame(			sortedList,					unsortedList);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList,				sortedList);
		assertFalse(		areAllUsersEquals	);
		
		/*for (User user: sortedList) {
			UtilsLibrary.print( user.getNome() );
		}*/
	}
	
	@Test
	public void testSortWithComparatorAndLambdaShort() {
		List<User> unsortedList	= Chapter02_LambdaExpressions.getUsersList();
		List<User> sortedList	= Chapter05_ComparatorLambda.sortWithComparatorAndLambdaShort(Chapter02_LambdaExpressions.getUsersList());
		
		assertEquals(			unsortedList.size(),		sortedList.size()	);
		assertNotEquals(		sortedList,					unsortedList);
		assertNotSame(			sortedList,					unsortedList);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList,				sortedList);
		assertFalse(		areAllUsersEquals	);
		
		/*for (User user: sortedList) {
			UtilsLibrary.print( user.getNome() );
		}*/
	}
	
	@Test
	public void testEqualsUnsortedUsers() {
		List<User> unsortedList01	= Chapter02_LambdaExpressions.getUsersList();
		List<User> unsortedList02	= Chapter02_LambdaExpressions.getUsersList();
		
		assertEquals(	unsortedList01.size(),	unsortedList02.size()	);
		
		boolean areAllUsersEquals = assertAllUsersAreEquals(unsortedList01, unsortedList02);
		assertTrue(		areAllUsersEquals	);
	}
	
	@Test
	public void testSameUnsortedUsers() {
		List<User> unsortedList01	= Chapter02_LambdaExpressions.getUsersList();
		List<User> unsortedList02	= Chapter02_LambdaExpressions.getUsersList();
		
		assertEquals(	unsortedList01.size(),	unsortedList02.size()	);
		
		boolean areAllUsersTheSame = assertAllUsersAreSame(unsortedList01, unsortedList02);
		
		assertFalse(	areAllUsersTheSame	);
	}
	
	@Test
	public void testComparatorNaturalOrder() {
		List<String> sortedList = Chapter05_ComparatorLambda.sortComparatorByNaturalOrder();
		/*for ( String word: sortedList ) {
			UtilsLibrary.print(word);
		}*/
	}
	
	@Test
	public void testComparatorReverseOrder() {
		List<String> sortedList = Chapter05_ComparatorLambda.sortComparatorByReverseOrder();
		/*for ( String word: sortedList ) {
			UtilsLibrary.print(word);
		}*/
	}
	
	@Test
	public void testCompareNameThroughFunction() {
		List<User> usersList = Chapter05_ComparatorLambda.compareNameThroughFunction();
		
		/*UtilsLibrary.print("=== testCompareNameThroughFunction ===");
		for ( User user: usersList ) {
			UtilsLibrary.print(user.getNome());
		}*/
	}
	
	@Test
	public void testComparePontuationThroughToIntFunction() {
		List<User> usersList = Chapter05_ComparatorLambda.comparePontuationThroughToIntFunction();
		
		/*UtilsLibrary.print("=== testComparePontuationThroughToIntFunction ===");
		for ( User user: usersList ) {
			UtilsLibrary.print(user.getNome() + " = " + user.getPontuacao());
		}*/
	}
	
	@Test
	public void testcomparePontuationThroughComparatorComparingInt() {
		List<User> usersList = Chapter05_ComparatorLambda.comparePontuationThroughComparatorComparingInt();
		
		UtilsLibrary.print("=== testcomparePontuationThroughComparatorComparingInt ===");
		for ( User user: usersList ) {
			UtilsLibrary.print(user.getName() + " = " + user.getScore());
		}
	}
	
	private boolean assertAllUsersAreEquals(List<User> pList01, List<User> pList02) {
		boolean areAllUsersEquals = true;
		for ( int i = 0; i < pList01.size()  ; i = i + 1 ) {
			User user01 = pList01.get(i);
			User user02 = pList02.get(i);
			
			if ( !user01.equals(user02) ) {
				areAllUsersEquals = false;
				break;
			}
		}
		
		return areAllUsersEquals;
	}
	
	private boolean assertAllUsersAreSame(List<User> pList01, List<User> pList02) {
		boolean areAllUsersTheSame = true;
		for ( int i = 0; i < pList01.size()  ; i = i + 1 ) {
			User user01 = pList01.get(i);
			User user02 = pList02.get(i);
			
			if ( user01 != user02 ) {
				areAllUsersTheSame = false;
				break;
			}
		}
		return areAllUsersTheSame;
	}
	
}