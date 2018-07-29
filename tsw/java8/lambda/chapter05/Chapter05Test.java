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
		
		assertNotEquals(	sortedList,		unsortedList);
		assertNotSame(		sortedList,		unsortedList);
	}
	
	@Test
	public void unsortedUsers() {
		List<Usuario> unsortedList01	= Chapter02.getListaUsuarios();
		List<Usuario> unsortedList02	= Chapter02.getListaUsuarios();
		
		assertEquals(		unsortedList02, unsortedList01);
		assertNotSame(		unsortedList02, unsortedList01);
	}
	
}