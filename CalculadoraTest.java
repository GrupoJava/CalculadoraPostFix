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
 * Esta clase <CalculadoraTest> permite realizar pruebas con JUnit
 * para comprobar que los métodos de Calculadora funcionen de manera correcta
 * 
 * @author André Rodas
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 */
public class CalculadoraTest {

	@Test
	public void testCalculadora() {
		Calculadora<Integer> pruebaCalcu = new Calculadora<Integer>();
		assertEquals("",pruebaCalcu.getMyStr(),"");
		assertEquals(0,pruebaCalcu.getOp1(),0);
		assertEquals(0,pruebaCalcu.getOp2(),0);
		if (pruebaCalcu.getMySta().isEmpty())
			assertEquals(0,0,0);
		else 
			assertEquals(0,10,0);
	}

	@Test
	public void testCalcular() {
		Calculadora<Integer> pruebaCalcu = new Calculadora<Integer>();
		pruebaCalcu.setMyStr("392*+3-");
		try {
			assertEquals(18,pruebaCalcu.calcular(),0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
