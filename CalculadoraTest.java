import static org.junit.Assert.*;

import org.junit.Test;


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
