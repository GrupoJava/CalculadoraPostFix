/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;



/**
 *Esta clase <StackTest> permite realizar pruebas con JUnit
 * para comprobar que los métodos de Stack funcionen de manera correcta
 * 
 * @author André Rodas
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 */
public class StackTest {

	@Test
	public void testIsEmpty() {
		Stack<Integer> pruebaStack = new Stack<Integer>();
		if (pruebaStack.isEmpty())
			assertEquals(0,0,0);
	}

	@Test
	public void testSize() {
		Stack<Integer> pruebaStack = new Stack<Integer>();
		pruebaStack.push(13);
		assertEquals(1,pruebaStack.size(),0);
	}

	@Test
	public void testPop() {
		Stack<Integer> pruebaStack = new Stack<Integer>();
		pruebaStack.push(13);
		try {
			assertEquals(13,pruebaStack.pop(),0);
			pruebaStack.push(19);
			assertEquals(19,pruebaStack.pop(),0);
			if (pruebaStack.isEmpty())
				assertEquals(0,0,0);
			else
				assertEquals(10,0,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testPeek() {
		Stack<Integer> pruebaStack = new Stack<Integer>();
		pruebaStack.push(13);
		try {
			assertEquals(13,pruebaStack.peek(),0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testPush() {
		Stack<Integer> pruebaStack = new Stack<Integer>();
		pruebaStack.push(13);
		assertEquals(1,pruebaStack.size(),0);
	}

}
