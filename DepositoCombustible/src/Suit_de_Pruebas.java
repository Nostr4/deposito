import static org.junit.Assert.*;

import org.junit.Test;

public class Suit_de_Pruebas {
	

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = 	new DepositoCombustible(50.0,0.0);
		tank.fill(10);
		assertEquals(10.0, tank.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = 	new DepositoCombustible(20.0,0.0);
		assertEquals(20.0, tank.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = 	new DepositoCombustible(40.0,0.0);
		assertTrue(tank.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = 	new DepositoCombustible(20.0,20.0);
		assertTrue(tank.estaLleno());
	}

	@Test
	public void testFill() {
		DepositoCombustible tank = 	new DepositoCombustible(30.0,0.0);
		tank.fill(20.0);
		assertEquals(20.0, tank.getDepositoNivel(),0);
	}

	@Test
	public void testConsumir() {
		DepositoCombustible tank = 	new DepositoCombustible(30.0,30.0);
		tank.consumir(20.0);
		assertEquals(10.0, tank.getDepositoNivel(),0);
	}

}
