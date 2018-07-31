package java8.lambda.chapter05;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

import java8.lambda.chapter02.Chapter02;
import java8.lambda.chapter02.Usuario;

public class Chapter05Test {
	
	@Test
	public void ordenateUsers() {
		List<Usuario> unsortedList	= Chapter02.getListaUsuarios();
		List<Usuario> sortedList	= Chapter05.sort(Chapter02.getListaUsuarios());
		
		assertEquals(		unsortedList.size(),		sortedList.size()	);
		assertNotEquals(	sortedList,					unsortedList);
		assertNotSame(		sortedList,					unsortedList);
	}
	
	@Test
	public void testEqualsUnsortedUsers() {
		List<Usuario> unsortedList01	= Chapter02.getListaUsuarios();
		List<Usuario> unsortedList02	= Chapter02.getListaUsuarios();
		
		assertEquals(	unsortedList01.size(),	unsortedList02.size()	);
		
		boolean areAllUsersEquals = true;
		for ( int i = 0; i < unsortedList01.size()  ; i = i + 1 ) {
			Usuario user01 = unsortedList01.get(i);
			Usuario user02 = unsortedList02.get(i);
			
			if ( !user01.equals(user02) ) {
				areAllUsersEquals = false;
			}
		}
		
		assertTrue(		areAllUsersEquals	);
	}
	
	@Test
	public void testSameUnsortedUsers() {
		List<Usuario> unsortedList01	= Chapter02.getListaUsuarios();
		List<Usuario> unsortedList02	= Chapter02.getListaUsuarios();
		
		assertEquals(	unsortedList01.size(),	unsortedList02.size()	);
		
		boolean areAllUsersTheSame = true;
		for ( int i = 0; i < unsortedList01.size()  ; i = i + 1 ) {
			Usuario user01 = unsortedList01.get(i);
			Usuario user02 = unsortedList02.get(i);
			
			if ( user01 != user02 ) {
				areAllUsersTheSame = false;
			}
		}
		
		assertFalse(	areAllUsersTheSame	);
	}
	
}